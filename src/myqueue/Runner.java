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
public class Runner {

    public static void main(String[] args) {
        QueueClass queueClass = new QueueClass();
        queueClass.setSize(5);
        queueClass.insert("lol 1");
        queueClass.insert("lol 2");
        queueClass.insert("lol 3");
        queueClass.insert("lol 4");
        queueClass.insert("lol 5");
        queueClass.delete();        
        queueClass.deleteAll();
        

    }

}
