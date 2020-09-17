package oracle.apps.hcm.lovHelper.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import oracle.apps.hcm.lovHelper.model.ContentItem;

public interface ContentItemRepository  extends CrudRepository<ContentItem,Long>{
	
	List<ContentItem> findByContentTypeId(Long contentTypeId);
	
}
