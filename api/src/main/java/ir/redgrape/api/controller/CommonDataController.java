package ir.redgrape.api.controller;

import ir.redgrape.model.CommonDataAddRequest;
import ir.redgrape.model.IDResponse;
import ir.redgrape.service.CommonDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common-data")
public class CommonDataController {

    private CommonDataService commonDataService;

    public CommonDataController(CommonDataService commonDataService){
        this.commonDataService = commonDataService;
    }

    @PostMapping()
    public ResponseEntity<IDResponse> Add(@RequestBody CommonDataAddRequest request){
        IDResponse idResponse = commonDataService.add(request);
        return new ResponseEntity(idResponse,HttpStatus.OK);
    }
}
