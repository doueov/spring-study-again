package study.again;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test2")
    @ResponseBody
    public ResponseData test2(@RequestBody RequestData data) {
        System.out.println(data.getData());
        System.out.println(data.getNum());
        ResponseData responseData = new ResponseData();
        responseData.setMessage("bye");
        return responseData;
    }

    @PostMapping("/power")
    @ResponseBody
    public CalculatorResult power(@RequestBody Calculator cal) {
        int result = 1;
        CalculatorResult calculatorResult = new CalculatorResult();
        for (int i = 0; i < cal.getPow(); i++) {
            result *= cal.getNum();
        }
        calculatorResult.setResult(result);
        return calculatorResult;
    }

}
