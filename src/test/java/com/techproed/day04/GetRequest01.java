package com.techproed.day04;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

   // https://restful-booker.herokuapp.com/booking/3 adresine bir request gonderildiginde donecek cevap(response) icin
   // HTTP status kodunun 200
   // Content Type'in Json
    //Ve Status Line'in HTTP/1.1 200 OK
 //   Oldugunu test edin


    @Test
    public void test01(){

        // 1- url belirlenmeli
        String url="https://restful-booker.herokuapp.com/booking/3" ;

        //2-expected result oluştur...
//burada bizden body de gelen resposu assert etmemiz beklenmemiştir. bu sebeple bu adıma gerek yoktur.

        //3-request gönder

        Response response=given().
                accept("application/json").
                when().
                get(url);

      //  response.prettyPrint();

        //4- response al(actual result)

        //body testi yapmadığım için actual result almıyorum





        System.out.println("status code:"+response.getStatusCode());
        System.out.println("status Line: "+response.getStatusLine());
        System.out.println("Headers: "+response.getHeaders());
        System.out.println("content type: "+response.getContentType());


        //5- assertion işlemini yapalım

        response.then().
               assertThat().
                statusCode(200).
               contentType(ContentType.JSON).
              statusLine("HTTP/1.1 200 OK");
/*
        Assert.assertEquals(200,response.getStatusCode());

//expected kısmı bize task olarak verilen degerdir,actual kısmı ise response dan dönen değerdir
        //status code int deger döndürür

Assert.assertEquals("application/json; charset=utf-8",response.getContentType());
Assert.assertEquals("HTTP/1.1 200 OK",response.getStatusLine());

    */

    }

}














