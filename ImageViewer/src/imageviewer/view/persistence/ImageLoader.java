package imageviewer.view.persistence;

import imageviewer.model.Image;

public interface ImageLoader {
    Image load();
    Image next();
    Image prev();
}