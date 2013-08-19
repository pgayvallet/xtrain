package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.DbFile;
import org.springframework.stereotype.Component;

@Component
public interface DbFileDAO extends GenericDAO<Long, DbFile> {
}
