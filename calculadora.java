import java.util.Scanner;

public class calculadora{
	public static void main(String[] args) {
		Scanner Zodiaco = new Scanner(System.in);
		int Dia,Mes;
		System.out.println("ingrese el mes de nacimiento:"
			+ "\n1-Enero"
			+ "\n2-Febrero"
			+ "\n3-Marzo"
			+ "\n4-Abril"
			+ "\n5-Mayo"
			+ "\n6-Junio"
			+ "\n7-Julio"
			+ "\n8-Agosto"
			+ "\n9-Septiembre"
			+ "\n10-Octubre"
			+ "\n11-Noviembre"
			+ "\n12-Diciembre");
		Mes=Zodiaco.nextInt();
		System.out.println("");
		System.out.println("en que dia del mes nacio:");
		Dia=Zodiaco.nextInt();
				if((Dia>=21 && Mes==3)||(Dia<=20 && Mes==4)) {
					System.out.println("su signo es Aries");
				}else{
					if((Dia>21 && Mes==4) || (Dia<=20 && Mes==5)) {
						System.out.println("su signo es Tauro");
					}else{
						if((Dia>=21 && Mes==5)||(Dia<=20 && Mes==6)) {
							System.out.println("su signo es Geminis");
						}
						else{
							if((Dia>=21 && Mes==6)||(Dia<=20 && Mes==7)) {
								System.out.println("su signo es Cancer");
							}
							else{
								if((Dia>=21 && Mes==7)||(Dia<=20 && Mes==8)) {
									System.out.println("su signo es Leo");
								}
								else{
									if((Dia>=21 && Mes==8)||(Dia<=20 && Mes==9)) {
										System.out.println("su signo es Virgo");
									}
									else{
										if((Dia>=21 && Mes==9)||(Dia<=20 && Mes==10)) {
											System.out.println("su signo es Libra");
										}
										else{
											if((Dia>=21 && Mes==10)||(Dia<=20 && Mes==11)) {
												System.out.println("su signo es Escorpio");
											}
											else{
												if((Dia>=21 && Mes==11)||(Dia<=20 && Mes==12)) {
													System.out.println("su signo es Sagitario");
												}
												else{
													if((Dia>=21 && Mes==12)||(Dia<=20 && Mes==1)) {
														System.out.println("su signo es Capricornio");
													}
													else{
														if((Dia>=21 && Mes==1)||(Dia<=20 && Mes==2)) {
															System.out.println("su signo es Acuario");
														}
														else{
															if((Dia>=21 && Mes==2)||(Dia<=20 && Mes==3)) {
																System.out.println("su signo es Piscis");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

