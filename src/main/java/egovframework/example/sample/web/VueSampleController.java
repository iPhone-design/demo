package egovframework.example.sample.web;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.example.sample.service.SampleDefaultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class VueSampleController {

    private final EgovSampleService sampleService;

    @GetMapping(value = "/samples.do")
    public List<?> samples() throws Exception {
        SampleDefaultVO sampleVO = new SampleDefaultVO();
        sampleVO.setPageSize(10);
        sampleVO.setFirstIndex(0);

        return sampleService.selectSampleList(sampleVO);
    }
}