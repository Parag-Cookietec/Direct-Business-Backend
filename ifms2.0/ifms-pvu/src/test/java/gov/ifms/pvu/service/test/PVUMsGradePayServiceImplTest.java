package gov.ifms.pvu.service.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.exception.CustomException;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.common.pagination.SearchParam;
import gov.ifms.pvu.converter.PVUMsGradePayConverter;
import gov.ifms.pvu.dto.PVUMsGradePayDto;
import gov.ifms.pvu.entity.PVUMsGradePayEntity;
import gov.ifms.pvu.repository.PVUMsGradePayRepository;
import gov.ifms.pvu.service.PVUMsGradePayServiceImpl;

class PVUMsGradePayServiceImplTest {
	@InjectMocks
	private PVUMsGradePayServiceImpl service;

	@Mock
	private PVUMsGradePayRepository repository;

	@Mock
	private PVUMsGradePayEntity entity;

	@Mock
	Page<PVUMsGradePayEntity> page;

	@Mock
	List<PVUMsGradePayEntity> lst;

	@Mock
	List<PVUMsGradePayDto> list;

	@Mock
	PVUMsGradePayConverter converter;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetPVUGradePay() {
		when(repository.getOne(1L)).thenReturn(entity);
		service.getPVUGradePay(1l);
		verify(repository, times(1)).getOne(1l);
	}

	@Test
	void testSaveOrUpdatePVUGradePay() {
		when(repository.save(entity)).thenReturn(entity);
		assertNotNull(service.saveOrUpdatePVUGradePay(entity));
		verify(repository, times(1)).save(entity);
	}

	@SuppressWarnings("unchecked")
	@Test
	void testGetPVUGradePays() throws CustomException {
		List<SearchParam> jsonArr = new ArrayList<SearchParam>();
		jsonArr.add(new SearchParam("isSearch", "1"));
		jsonArr.add(new SearchParam("empNo", "1"));
		jsonArr.add(new SearchParam("empName", "V"));
		jsonArr.add(new SearchParam("caseNo", " "));
		jsonArr.add(new SearchParam("startDate", ""));
		jsonArr.add(new SearchParam("endDate", ""));
		jsonArr.add(new SearchParam("officeId", "0"));
		jsonArr.add(new SearchParam("designationId", "0"));
		jsonArr.add(new SearchParam("transNo", " "));
		jsonArr.add(new SearchParam("workflowId", "0"));

		PageDetails pageDetail = new PageDetails();
		pageDetail.setPageElement(1);
		pageDetail.setPageIndex(0);
		pageDetail.setJsonArr(jsonArr);
		when(repository.findAll(Mockito.any(Specification.class), Mockito.any(PageRequest.class))).thenReturn(page);
		when(page.getContent()).thenReturn(lst);
		when(converter.toDTO(lst)).thenReturn(list);
		PagebleDTO<PVUMsGradePayDto> data = service.getPVUGradePays(pageDetail);
		assertNotNull(data);
	}

}
