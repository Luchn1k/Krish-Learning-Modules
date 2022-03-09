/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain;

/**
 *
 * @author Luchn1k
 */
class Filter3 extends Request{

    @Override
    public void validate(Data data) {
        if(data.getParams().contains("&")){
            if(data.getParams().split("&")[0].contains("username") && data.getParams().split("&")[1].contains("password")){
                System.out.println("Request Approved");
            }else{
                System.out.println("invalid parameter");
            }
        }else{
            System.out.println("invalid parameter");
        }
    }
}