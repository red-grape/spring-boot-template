package ir.redgrape.service;

import ir.redgrape.model.CommonDataAddRequest;
import ir.redgrape.model.IDResponse;
import ir.redgrape.model.entities.CommonDataEntitiy;
import ir.redgrape.repo.CommonDataRepo;
import org.springframework.stereotype.Service;

@Service
public class CommonDataService {
    private CommonDataRepo commonDataRepo;

    public CommonDataService(CommonDataRepo commonDataRepo){
        this.commonDataRepo = commonDataRepo;
    }

    public IDResponse add(CommonDataAddRequest req){
        CommonDataEntitiy commonDataEntitiy = new CommonDataEntitiy();
        commonDataEntitiy.setCaption(req.getCaption());
        commonDataEntitiy.setTag(req.getTag());
        commonDataEntitiy.setFixID(req.getFixID());
        CommonDataEntitiy result = this.commonDataRepo.save(commonDataEntitiy);
        return new IDResponse(result.getId());
    }
}
