package com.inforlusion.pruebas;

import com.inforlusion.soundexcastellano.SoundExCastellano;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Similitud entre rayo y rayó: "+SoundExCastellano.soundexcastellano("rayo", "rayó"));
		System.out.println("Similitud entre avion y avión: "+SoundExCastellano.soundexcastellano("avión", "avion"));
		System.out.println("Similitud entre había y abia: "+SoundExCastellano.soundexcastellano("había", "abia"));
		System.out.println("Similitud entre o y ó: "+SoundExCastellano.soundexcastellano("ó", "o"));
		System.out.println("Similitud entre a y á: "+SoundExCastellano.soundexcastellano("á", "a"));
		System.out.println("Similitud entre pelito y pelo: "+SoundExCastellano.soundexcastellano("pelito", "pelo"));
	}

}
