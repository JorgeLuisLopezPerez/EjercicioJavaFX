package org.example;

//Utilizando clases abstractas con métodos y propiedades estáticas podemos compartir datos entre múltiples escenas e instancias
//dentro de la misma aplicación a la vez que centralizamos el control de datos.
public abstract class StaticData {
	private static String[] fortunes = new String[] {
			"aprovecha el buen momento económico que tienes para mantener tus cuentas saneadas.",
			"encontrarás la solución a un problema que tenías desde hace tiempo.",
			"se avecinan malentendidos y discusiones, pero estás a tiempo de evitarlo.",
			"tendrás noticias directas de alguien muy especial para ti y serán favorables.",
			"tómate la vida con calma, quizá necesites aislarte un poco para estar bien.",
			"la música te hará mucho bien si te sientes con tensión, te ayudará a relajarte.",
			"no te precipites en tus afirmaciones en el trabajo, piensa antes de hablar.",
			"comprarás cosas muy necesarias, y emplearás de forma acertada tu dinero.",
			"te va bien en lo social y eso te proporcionará una gran seguridad en ti mismo.",
			"puedes conocer a una persona que se convertirá en una buena compañía, o algo más.",
			"no te iría mal seguir una dieta más sana y equilibrada para aumentar tu energía.",
			"trata de mantener las buenas costumbres que estás empezando a desarrollar."
	};
	
	public static String latestName = "";
	public static String latestSign = "";
	
	public static String getRandomFortune() {
		return fortunes[(int)Math.floor(Math.random() * fortunes.length)];
	}
}
