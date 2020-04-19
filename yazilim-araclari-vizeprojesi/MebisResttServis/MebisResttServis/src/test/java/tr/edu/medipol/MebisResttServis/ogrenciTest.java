package tr.edu.medipol.MebisResttServis;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;




class ogrenciTest {

	@Test 
	public void ogrenciTest1() {
		//Given-- on koşullar

	List<String> ogrenciler = new ArrayList<>();
		 {
			 String isim ="kemal";
			 String isim2 ="simge";
			 String isim3 ="gökhan";
			 String isim4 ="beyda";
			 
			//When-- Asil test edilen birim calıstırılır
		
		ogrenciler.add(isim);
		ogrenciler.add(isim2);
		ogrenciler.add(isim3);
		ogrenciler.add(isim4);
			
		//Then--sonrasındaki kontroller
			assertEquals("kemal",isim);
			assertEquals("simge",isim2);
			assertEquals("gökhan",isim3);
			assertEquals("beyda",isim4);
			
		}

	}
	@Test

	//Given-- on koşullar

	public void   ogrenciekle() {
		List<String> ogrenciler = new ArrayList<>();{
			 String isim ="kemal";
		 }
		//When-- Asil test edilen birim calıstırılır
		 
		 String yenisim="ibrahim";
		 
		 ogrenciler.add(yenisim);
		 
		 
		//Then--sonrasındaki kontroller
		 
		 assertEquals(yenisim,"ibrahim");
	   
	}
	@Test	
	public void Ogrencisil() {
	
		//Given-- on koşullar
			List<String> ogrenciler = new ArrayList<>();
			 {
				 
				 String isim3 ="gökhan";
				 
				//When-- Asil test edilen birim calıstırılır
				 
				 ogrenciler.remove(isim3);
		    
				//Then--sonrasındaki kontroller
				 assertEquals(isim3,"gökhan");
			 }
	}
	@Test
	public void OgrenciGuncelle() {
		
		
		//Given-- on koşullar
		
		List<String> ogrenciler = new ArrayList<>();
		
		 {
			 String isim2 ="simge";
			 
				//When-- Asil test edilen birim calıstırılır
			 
			 ogrenciler.remove(isim2);
			 
			 isim2 = "mustafa";
	
				 
				ogrenciler.add(isim2);
				
				//Then--sonrasındaki kontroller
				
				assertEquals(isim2,"mustafa");
				
		 }
		 
	}
	@Test
	public void OgrenciNotGuncelle() {
		
		
		//Given-- on koşullar
		
		List<String> ogrenciler = new ArrayList<>();
		
		 {
			 String isim2 ="kemal";
			 String not ="80";
			 
				//When-- Asil test edilen birim calıstırılır
			 
			 ogrenciler.remove(isim2);
			 ogrenciler.remove(not);
			 
			 
			 isim2 = "kemal";
			 not = "100";
	
				 
				ogrenciler.add(isim2);
				ogrenciler.add(not);
				
				//Then--sonrasındaki kontroller
				
				assertEquals(isim2,"kemal");
				assertEquals(not,"100");
				
		 }
		 
	}



	
}


