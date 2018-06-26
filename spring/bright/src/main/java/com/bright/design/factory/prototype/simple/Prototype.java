package com.bright.design.factory.prototype.simple;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-30 16:25
 **/
@Getter
@Setter
public class Prototype implements Cloneable,Serializable
{
    private String name;

    private ArrayList<String> list = new ArrayList();

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    /**
     * 深复制
     * @return
     */
    public Object deepClone() throws IOException, ClassNotFoundException
    {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Prototype copy = (Prototype)ois.readObject();
            copy.name = "123";
            return copy;


        }
        catch (Exception e)
        {
            throw  e;
        }
    }

}
