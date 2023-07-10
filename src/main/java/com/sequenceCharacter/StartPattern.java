package com.sequenceCharacter;

public class StartPattern {
	
	

	public String printPattern(int number) {
		String stars="";
		for(int count=1;count<=number;count++)
		{
			stars+="*";
		}
		return stars;
	}
	
	public String printPatternWithRowAndColumn(int number) {
		String stars="";
		for(int index=1;index<=number;index++) {
			for(int count=1;count<=index;count++)
			{
				stars+="*";
			}
			if(!(index==number))
			stars+="\n";
		}
		return stars;
	}

}
