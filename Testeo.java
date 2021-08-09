package UD_22.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Geometria.Geometria;

class Testeo {
	Geometria Geometria = new Geometria();

	@Test
	public void TestAreaCuadrado() {
		int resultado = Geometria.areacuadrado(3);
		int esperando = 9;
		assertEquals(esperando, resultado);
	}

	@Test
	public void TestAreaCirculo() {
		double resultado = Geometria.areaCirculo(10);
		double esperando=314.15999999999997;
		assertEquals(esperando, resultado);
	}
	
	@Test
	public void TestAreaTriangulo() {
		int resultado = Geometria.areatriangulo(5, 2);
		double esperando = 5;
		assertEquals(esperando, resultado);
	}
	
	@Test
	public void TestAreaRectangulo() {
		int resultado = Geometria.arearectangulo(3, 2);
		int esperando = 6;
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestAreaPentagono() {
		int resultado = Geometria.areapentagono(3, 2);
		int esperando = 3;
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestAreaRombo() {
		int resultado = Geometria.arearombo(3, 2);
		int esperando = 3;
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestAreaRomboide() {
		int resultado = Geometria.arearomboide(3, 2);
		int esperando = 6;
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestAreaTrapecio() {
		int resultado = Geometria.areatrapecio(2, 2, 2);
		int esperando = 4;
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraCuadrado() {
		String resultado = Geometria.figura(1);
		String esperando = "cuadrado";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraCirculo() {
		String resultado = Geometria.figura(2);
		String esperando = "Circulo";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraTriangulo() {
		String resultado = Geometria.figura(3);
		String esperando = "Triangulo";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraRectangulo() {
		String resultado = Geometria.figura(4);
		String esperando = "Rectangulo";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraPentagono() {
		String resultado = Geometria.figura(5);
		String esperando = "Pentagono";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraRombo() {
		String resultado = Geometria.figura(6);
		String esperando = "Rombo";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraRomboide() {
		String resultado = Geometria.figura(7);
		String esperando = "Romboide";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraTrapecio() {
		String resultado = Geometria.figura(8);
		String esperando = "Trapecio";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestFiguraDefault() {
		String resultado = Geometria.figura(9);
		String esperando = "Default";
		assertEquals(esperando, resultado);
	}
	@Test
	public void TestGetId() {
		int resultado = Geometria.getId();
        int esperado = Geometria.getId();
        assertEquals(esperado, resultado);
	}
	@Test
	public void TestSetId() {
		Geometria.setId(1);
        int resultado = Geometria.getId();
        int esperado = 1;
        assertEquals(esperado, resultado);
	}
	@Test
	public void TestGetNom() {
		String resultado = Geometria.getNom();
        String esperado = Geometria.getNom();
        assertEquals(esperado, resultado);
	}
	@Test
	public void TestSetNom() {
		Geometria.setNom("cuadrado");
        String resultado = Geometria.getNom();
        String esperado = Geometria.getNom();
        assertEquals(esperado, resultado);
	}
	@Test
	public void TestGetArea() {
		int resultado = Geometria.getId();
        int esperado = Geometria.getId();
        assertEquals(esperado, resultado);
	}
	@Test
	public void TestSetArea() {
		Geometria.setId(1);
        int resultado = Geometria.getId();
        int esperado = 1;
        assertEquals(esperado, resultado);
	}
}
