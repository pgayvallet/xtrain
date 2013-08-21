definePackage("xebia", function(pkg) {

    $(function() {

        // initialize nav view
        var nav = new xebia.nav.NavView({el : $("#nav")});

        // initialize left nav if required
        var leftNavElement = $(".left-nav");
        if(leftNavElement.length>0) {
            var leftNav = new xebia.training.LeftNavView({el : leftNavElement});
        }

        // displaying vimeo videos.
        var vimeoContainers = $(".x-vimeo-container");
        _.each(vimeoContainers, function(vimeoContainer, i) {
            var channelId = $(vimeoContainer).attr("data-channelId");
            if(channelId) {
                var videos = new xebia.vimeo.VimeoVideoCollection(null, {channelId : channelId});
                var videosView = new xebia.vimeo.VimeoVideoCollectionView({collection : videos});
                videosView.$el.appendTo(vimeoContainers);
                videos.fetch();
            }
        });

        // displaying blog articles
        var blogContainers = $(".x-blog-container");
        _.each(blogContainers, function(blogContainer, i) {
            var blogCategory = $(blogContainer).attr("data-category");
            if(blogCategory) {
                var articles = new xebia.blog.BlogArticleCollection(null, {category : blogCategory});
                var articlesView = new xebia.blog.BlogArticleCollectionView({collection: articles});
                articlesView.$el.appendTo(blogContainer);
                articles.fetch();
            }
        });

    });


});


