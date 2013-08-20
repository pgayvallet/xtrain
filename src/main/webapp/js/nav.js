definePackage("xebia.nav", function(pkg) {

    pkg.NavView = Backbone.View.extend({

        events : {
            "mouseenter .nav-first a"   : "onFirstLevelMouseEnter",
            "mouseenter .nav-sub a"     : "onSecondLevelMouseEnter",
            "mouseleave"                : "onMouseLeave"
        },

        defaultSelection : "home",

        initialize : function() {
            _.bindAll(this);

            this.ui = {};
            this.ui.first = this.$(".nav-first");
            this.ui.firstPointer = this.ui.first.find(".pointer");
            this.ui.sub = this.$(".nav-sub");
            this.ui.subPointer = this.ui.sub.find(".pointer");
            this.ui.last = this.$(".nav-last");

            this.selected = this.$el.attr("data-selected") || this.defaultSelection;
            this.setFirstPointer(this.selected);

            this.leaveTimer = null;
        },

        setFirstPointer : function(linkId, animate) {
            this.clearLeaveTimeout();
            var navLink = this.$("a[data-id=" + linkId + "]");
            if(!navLink) {
                return;
            }
            var navCenter = navLink.position().left + (navLink.width() / 2) + (this.ui.firstPointer.width() / 2) + 1;
            if(animate) {
                this.ui.firstPointer.stop().animate({left: navCenter + "px"}, 500);
            } else {
                this.ui.firstPointer.css({left: navCenter + "px"});
            }
        },

        setSecondPointer : function(navLink, animate) {
            var navCenter = navLink.position().left + (navLink.width() / 2) + (this.ui.subPointer.width() / 2) + 1;
            if(animate) {
                this.ui.subPointer.stop().animate({left: navCenter + "px"}, 500);
            } else {
                this.ui.subPointer.css({left: navCenter + "px"});
            }

        },

        onFirstLevelMouseEnter : function(event) {
            var linkId = $(event.currentTarget).attr("data-id");
            this.setFirstPointer(linkId, true);
            var sectionContent = $(event.currentTarget).parent().children(".section-sub");
            if(sectionContent.length>0) {
                this._openSubLevel(sectionContent);
            } else {
                this._hideSubLevel();
            }
        },

        onSecondLevelMouseEnter : function(event) {
            this.setSecondPointer($(event.currentTarget), true);
        },

        _openSubLevel : function(sectionContent) {
            this.ui.sub.children(".nav-content").html(sectionContent.clone().children());
            this.setSecondPointer(this.ui.sub.find("a").eq(0), false);
            this.ui.sub.show();
            this.ui.sub.stop().animate({top: "40px"});
        },

        _hideSubLevel : function() {
            this.ui.sub.stop().animate({top: "0px"});
        },

        onMouseLeave : function(event) {
            var self = this;
            this.leaveTimer = window.setTimeout(function() {
                self._hideSubLevel();
                self.setFirstPointer(self.selected, true);
            }, 500);
        },

        clearLeaveTimeout : function() {
            if(this.leaveTimer) {
                window.clearTimeout(this.leaveTimer);
                this.leaveTimer = null;
            }
        }

    });

});