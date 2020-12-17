package main.java.tools;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import main.java.vo.Bankdetail;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ZxingCodeImage {
    public static void main(String[] args) {


       code1Image();
    }


    public static BufferedImage code2Image(Bankdetail bankdetail){
        int width=200;                                             //设置二维码的宽
        int height=200;                                            //设置二维码的长
        String format="png";                                    //设置二维码图片的格式
        String data="时间："+bankdetail.getTime()+"\n操作金额"+bankdetail.getMoney()+
                "\n卡内总金额："+bankdetail.getSum()+"\n转入还是转出："+bankdetail.getInorout()+
                "\n由谁操作："+bankdetail.getByorto();//设置数据
        //二维码参数
        HashMap hints=new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");        //设置支持中文编码
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);        //纠错等级。
        hints.put(EncodeHintType.MARGIN, 2);//边框
        BitMatrix bitMatrix=null;
        try{
            bitMatrix=new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, width, height,hints);
        }catch(Exception e){
            e.printStackTrace();
        }
        // 设置位矩阵转图片的参数
        MatrixToImageConfig config = new MatrixToImageConfig(Color.black.getRGB(), Color.white.getRGB());
        BufferedImage code2=MatrixToImageWriter.toBufferedImage(bitMatrix,config);
        return code2;
    }


    public static BufferedImage code1Image(){
        int width=400;
        int height=60;
        int i=(int)(Math.random()*900)+100;
        String str=String.valueOf(new Date().getTime());
        str=str.concat(String.valueOf(i));
        HashMap hints=new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");        //设置支持中文编码
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);        //纠错等级。
        hints.put(EncodeHintType.MARGIN, 2);

        BitMatrix bitMatrix=null;
        try {
            bitMatrix=new MultiFormatWriter().encode(str, BarcodeFormat.CODE_128, width, height,hints);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 设置位矩阵转图片的参数
        MatrixToImageConfig config = new MatrixToImageConfig(Color.black.getRGB(), Color.white.getRGB());
        BufferedImage code1=MatrixToImageWriter.toBufferedImage(bitMatrix,config);
        return code1;
    }
}
