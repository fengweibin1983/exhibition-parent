package com.kalix.exhibition.system.dict.dao;

import com.kalix.exhibition.system.dict.api.dao.IExhibitionDictBeanDao;
import com.kalix.exhibition.system.dict.entities.ExhibitionDictBean;
import com.kalix.framework.core.impl.dao.GenericDao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ExhibitionDictBeanDaoImpl extends GenericDao<ExhibitionDictBean, Long> implements IExhibitionDictBeanDao {
    @Override
    @PersistenceContext(unitName = "monitor-system-dict-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
