definePackage("xebia.nav", function(pkg) {


    $(function() {

        // displaying vimeo videos.
        var vimeoContainers = $(".vimeo-container");
        _.each(vimeoContainers, function(vimeoContainer, i) {
            var channelId = $(vimeoContainer).attr("data-channelId");
            if(channelId) {
                var videos = new xebia.vimeo.VimeoVideoCollection(null, {channelId : channelId});
                var videosView = new xebia.vimeo.VimeoVideoCollectionView({collection : videos});
                videosView.$el.appendTo(vimeoContainers);
                videos.fetch();
            }
        });


    });


});


