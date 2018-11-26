package com.baizhi.controller;

import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Map;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/queryAllProduct")
    public @ResponseBody Map queryAllProduct(Integer page, Integer rows ){
        System.out.println(page+"--------"+rows+"================");
        Map map=productService.getBookByPage(page,rows);
        return map;
    }



    @RequestMapping("/deleteMoney")
    public @ResponseBody boolean deleteMoney(int[] ids){
        try {

            for(int i=0;i<ids.length;i++){
                System.out.println(ids[i]);
            }
            System.out.println(
                    "888888888888888888888888888888"+ids
            );
            productService.deleteMoney(ids);
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

/*
    @RequestMapping("/insertProduct")
    public @ResponseBody boolean insertProduct(Product product){
        try {
            productService.insertProduct(product);
            return true;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

*/

/*
    @RequestMapping("/updateProduct")
    public @ResponseBody boolean updateUser(HttpServletRequest request,Product product,MultipartFile tupian){

        try {

            if(!"".equals(tupian.getOriginalFilename())){

                String realPath=request.getRealPath("/images");
                //new Date().getTime()+"_"+
                String newFileName=tupian.getOriginalFilename();
                tupian.transferTo(new File(realPath+"/"+newFileName));
                product.setGroundingdate(newFileName);

            }
           // System.out.println(auction);
           // auctionService.updateAuction(auction);
            productService.updateProduct(product);
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }

    }
*/

 /*   @RequestMapping("/updateAuction")
    public String updateAuction(Auction auction, HttpServletRequest request, MultipartFile tupian) throws Exception{
        if(!"".equals(tupian.getOriginalFilename())){

            String realPath=request.getRealPath("/images");
            //new Date().getTime()+"_"+
            String newFileName=tupian.getOriginalFilename();
            tupian.transferTo(new File(realPath+"/"+newFileName));
            auction.setAuction_pic(newFileName);

        }
        System.out.println(auction);
        auctionService.updateAuction(auction);
        return "redirect:/auction/selectAllAuction";
    }
*/


}
