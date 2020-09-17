package oracle.apps.hcm.lovHelper.controller;

import oracle.apps.hcm.lovHelper.model.ContentItem;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContentItemPageRepository extends PagingAndSortingRepository <ContentItem, Integer> {
	
	List<ContentItem> findAllByContentTypeId(Long contentTypeId, Pageable pageable);
	
	
	
}
