package fr.xebia.training.actions;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.DbFile;
import fr.xebia.training.model.Trainer;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StreamingResolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

import java.io.ByteArrayInputStream;

/**
 * ImagesActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/images/{$event}/{id}")
public class ImagesActionBean extends BaseActionBean {

    public static final String DEFAULT_AVATAR_PATH = "/img/default-avatar.png";

    @SpringBean
    private TrainerDAO trainerDAO;

    private long id;

    @HandlesEvent("trainer")
    public Resolution showTrainerImage() {
        Trainer trainer = trainerDAO.findById(id);
        if(trainer!=null) {
            DbFile pictureFile = trainer.getPictureFile();
            if(pictureFile!=null) {
                return new StreamingResolution(pictureFile.getContentType(), new ByteArrayInputStream(pictureFile.getContent()));
            } else {
                return forwardTo(DEFAULT_AVATAR_PATH);
            }
        } else {
            return forwardTo(DEFAULT_AVATAR_PATH);
        }
    }

    // get / set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
