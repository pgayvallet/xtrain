package fr.xebia.training.utils;

import fr.xebia.training.model.DbFile;
import net.sourceforge.stripes.action.FileBean;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

/**
 * FileUtils -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
public final class FileUtils {

    private static final Logger log = Logger.getLogger(FileUtils.class);

    private FileUtils() {
    }

    public static DbFile uploadToDbFile(FileBean fileBean) {
        try {
            DbFile dbFile = new DbFile();
            dbFile.setFileName(fileBean.getFileName());
            String[] fileNameSplits = fileBean.getFileName().split("[.]");
            String fileExtension = fileNameSplits.length > 0 ? fileNameSplits[fileNameSplits.length-1] : "data";
            dbFile.setFileExtension(fileExtension);
            dbFile.setFileSize(fileBean.getSize());
            dbFile.setContentType(fileBean.getContentType());
            dbFile.setContent(IOUtils.toByteArray(fileBean.getInputStream()));
            return dbFile;
        } catch(Exception e) {
            log.error("Error converting fileBean to dbFile", e);
            return null;
        }
    }

}
