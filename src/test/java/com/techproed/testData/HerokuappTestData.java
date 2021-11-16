package com.techproed.testData;

import java.util.HashMap;

public class HerokuappTestData {
    /*
    {
    "firstname": "Susan",
    "lastname": "Ericsson",
    "totalprice": 521,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2015-03-05",
        "checkout": "2019-08-18"
    }
}
     */
public HashMap<String, Object> setUpTestData(){

    HashMap<String,Object>bookingdates=new HashMap<>();

    bookingdates.put("checkin","2015-03-05");
    bookingdates.put("checkout","2019-08-18");

    HashMap<String,Object> expectedData=new HashMap<String,Object>();
    expectedData.put("firstname","Eric");
    expectedData.put("lastname" , "Smith");
    expectedData.put("totalprice" , 716);
    expectedData.put("depositpaid" , false);
    expectedData.put("bookingdates" , bookingdates);

return expectedData;
}

}
