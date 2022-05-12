package gov.ifms.doi.db.utility;

import gov.ifms.doi.jpa.constant.DoiJPAConstants;
import gov.ifms.doi.jpa.dto.DoiCommonLookUpInfoDTO;
import gov.ifms.doi.jpa.service.imp.DoiCommonLookupInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

@Component
public class DbUtility {

    @Autowired
    DoiCommonLookupInfoServiceImpl doiCommonLookupInfoServiceImpl;

    public String getReferenceNumber(String key,String uri) {
        List<DoiCommonLookUpInfoDTO> response = doiCommonLookupInfoServiceImpl
                .getByParentLookUpName(key);
        String formatted = String.valueOf(Long.parseLong(response.get(0).getLookupInfoValue()) + 1);
        doiCommonLookupInfoServiceImpl.updateLookupInfoValue(key, formatted);
        int lastTwoDigits = Calendar.getInstance().get(Calendar.YEAR) % 100;
        return lastTwoDigits + "-" + (lastTwoDigits + 1) + uri + formatted;
    }

    public String getPolicyNumber(String policyNumberKey) {
        List<DoiCommonLookUpInfoDTO> response = doiCommonLookupInfoServiceImpl
                .getByParentLookUpName(policyNumberKey);
        String formatted = String.valueOf(Long.valueOf(response.get(0).getLookupInfoValue()) + 1);
        doiCommonLookupInfoServiceImpl.updateLookupInfoValue(policyNumberKey, formatted);
        return formatted;
    }
}
