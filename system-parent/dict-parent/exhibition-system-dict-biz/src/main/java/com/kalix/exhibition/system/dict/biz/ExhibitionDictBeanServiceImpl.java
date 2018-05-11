package com.kalix.exhibition.system.dict.biz;

import com.kalix.exhibition.system.dict.entities.ExhibitionDictBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.system.BaseDictServiceImpl;
import com.kalix.exhibition.system.dict.api.biz.IExhibitionDictBeanService;
import com.kalix.exhibition.system.dict.api.dao.IExhibitionDictBeanDao;


public class ExhibitionDictBeanServiceImpl extends BaseDictServiceImpl<IExhibitionDictBeanDao, ExhibitionDictBean> implements IExhibitionDictBeanService {
    @Override
    public JsonStatus saveEntity(ExhibitionDictBean entity) {
        Integer maxValue = dao.getFieldMaxValue("value","type='"+entity.getType()+"'");

        maxValue=maxValue+1;

        entity.setValue(maxValue);

        return super.saveEntity(entity);
    }
}
