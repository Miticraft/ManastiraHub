package com.miticraft.DiplomnaRabota;
import java.util.*;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
public class Sudoku_Kurva extends PlainDocument {
	private int limit;
	public Sudoku_Kurva(int limit) {
		super();
		this.limit = limit;
	}
	  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		    if (str == null)
		      return;

		    if ((getLength() + str.length()) <= limit) {
		      super.insertString(offset, str, attr);
		    }
		    for (int i = 1; i < 10; i++) {
		    	String x = String.valueOf(i);
				if (str.equals(x)) {
					
				}else {
					
				}
			}
		  }
}
