/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueue;

/**
 *
 * @author yasta
 */
public interface MyQueue {

    public void insert(Object element);

    public Object delete();

    public void deleteAll();

}
