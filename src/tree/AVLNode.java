/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author albertoobando
 */
public class AVLNode<T> {
    
    private AVLNode<T> Left, Right;
    private T Data;
    private int Height;

    /* Constructor */
    public AVLNode()
    {
        Left = null;
        Right = null;
        Data = (T) "";
        Height = 0;
    }
    /* Constructor */
    public AVLNode(T pTag)
    {
        Left = null;
        Right = null;
        Data = pTag;
        Height = 0;
    }
    
    //Setters and Getters
    
	public AVLNode getLeft() {
		return Left;
	}
	
	public void setLeft(AVLNode left) {
		this.Left = left;
	}
	
	public AVLNode getRight() {
		return Right;
	}
	
	public void setRight(AVLNode right) {
		this.Right = right;
	}
	
	public T getData() {
		return Data;
	}
	
	public void setData(T data) {
		this.Data = data;
	}
	
	public int getHeight() {
		return Height;
	}
	
	public void setHeight(int height) {
		this.Height = height;
	}
    
}
