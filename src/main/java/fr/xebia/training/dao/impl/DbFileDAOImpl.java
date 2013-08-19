package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.DbFileDAO;
import fr.xebia.training.model.DbFile;
import org.springframework.stereotype.Component;

@Component
public class DbFileDAOImpl extends GenericDAOImpl<Long, DbFile> implements DbFileDAO {
}
