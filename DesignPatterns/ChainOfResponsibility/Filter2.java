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
class Filter2 extends Request{

    @Override
    public void validate(Data data) {
        if(data.getUrl().contains("www.test.com")){
            this.request.validate(data);
        }else{
            System.out.println("Invalid URL");
        }
    }
}
