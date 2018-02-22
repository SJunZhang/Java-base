package com.fiberhome.foreach;

import java.util.Arrays;
import java.util.Collection;

public class EnumForeach {
	enum Face {ONE,TWO,THREE,FOUR,FIVE};
	public static void main(String[] args) {
		Collection<Face> faces =  Arrays.asList(Face.values());
		for(Face face1:faces){
			for(Face face2:faces){
				System.out.println(face1+","+face2);
			}
		}
	}
}

