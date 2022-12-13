package com.example.ticparte1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //array para frases cuando estas feliz
    String[] caraF = {
            "La vida es un regalo y no pienso desperdiciarla Nunca se sabe qué cartas repartirá la próxima vez",
            "Ser feliz no significa que todo sea perfecto Significa que has decidido ver más allá de las imperfecciones",
            "La felicidad no es algo prefabricado Viene de tus propias acciones",
            "Las cosas son bellas si se las ama",
            "Hay una sola forma de felicidad en la vida: amar y ser amado",
            "Aquellos que quieren cantar siempre encuentran una canción",
            "Cuando eres fiel a ti mismo en lo que haces, cosas fascinantes ocurren",
            "La belleza es poder, y una sonrisa es su espada",
            "La felicidad es la finalidad última de la existencia humana",
            "La felicidad está hecha para ser compartida",
            "El propósito de nuestras vidas es ser felices",
            "La vida es o una gran aventura o nada",
            "El secreto para tener felicidad es tener algo que hacer",
            "Puedes ser feliz allí donde estés",
            "Hay felicidad en el deber, aunque no lo parezca",
            "La felicidad no es algo que se pospone, sino algo que se diseña para el presente",
            "La alegría reside en la alegría del logro y en la emoción del esfuerzo creativo",
            "La independencia es felicidad",
            "La felicidad aparece cuando lo que piensas, lo que dices y lo que haces están en armonía",
            "El tiempo que disfrutas perdiéndolo no es tiempo perdido",
            "Una mesa, una silla, un bol de frutas y un violín. ¿Qué más necesita uno para ser feliz?",
            "No importa a dónde vayas: ahí estás tú",
            "La felicidad está dentro de uno, no al lado de alguien",
            "Hoy no tengo nada que hacer, excepto sonreír",
            "Unas palabras amables, un libro cálido y una sonrisa honesta pueden hacer milagros",
            "La sonrisa es una bienvenida universal",
            "Un optimista es la encarnación humana de la primavera",
            "Sonríe, es una terapia gratuita",
            "Ser optimista no le hace daño a nadie. Siempre puedes llorar luego",
            "La risa es un veneno para el miedo",
            "Existe una sola pasión: la pasión por la felicidad",
            "El optimismo perpetuo es un multiplicador de fuerzas",
            "El término felicidad perdería todo su significado si no fuese compensado por la tristeza",
            "Disfruto de mi vida porque las cosas no me van tal y como fueron planeadas",
            "La paz empieza con una sonrisa",
            "El asombro nos aguarda en cada esquina",
            "No llores porque se terminó, sonríe porque llegó a pasar",
            "Vive la vida que amas. Ama la vida que vives",
            "El hecho de perdonarse a uno mismo es ser feliz",
            "La felicidad es algo que se practica, como el violín",
            "Escucha de vez en cuando. Es fascinante lo que se puede escuchar",
            "El amor nunca nos dejará solos",
            "Una vida alegre es una creación única que no puede ser copiada de una receta",
            "El amor es ese micro-momento de calidez y conexión que compartimos con otro ser vivo",
            "La felicidad no está ahí fuera para que la encontremos, y la razón de eso es que está dentro de nosotros",
            "La felicidad es la única cosa que se multiplica cuando es compartida",
            "La diferencia entre el misterio y la felicidad depende de lo que hagamos con nuestra atención",
            "Una crisis es algo que sabe mal de desperdiciar",
            "Llegar a ser es mejor que ser",
            "No importa la edad, siempre hay algo bueno que superar",
            "Si uno no sabe a qué puerto navega, ningún tipo de viento le es favorable",
    };
    int i = 0;
    //array para frases cuando estas triste
    String[] caraT = {
            "Los años parecen pasar con más rapidez a medida que te vas haciendo mayor",
            "Hay veces que un hombre tiene que luchar tanto por la vida, que no tiene tiempo de vivirla",
            "Nunca puedes querer a nadie tanto cómo puedes echarlo de menos",
            "Descubrí que, con la depresión, una de las cosas más importantes de las que te puedes dar cuenta es que no estás solo/a. Siempre alguien estará a tu lado.",
            "La tristeza vuela en las alas del tiempo. Vuela con ella. Jean de La Fontaine.",
            "Recuerda que la palabra 'feliz' perdería su significado si no estuviera equilibrada por la tristeza",
            "No te dejes abrumar por la tristeza. Sé fuerte",
            "La vida siempre te sorprenderá con algo mejor.",
            "Llora si lo necesitas, yo estoy aquí para acompañarte.",
            "¡Recuerda, todo mejorará!",
            "Lo mejor es lo que sucede y lo bueno está por llegar.",
            "Cada experiencia es necesaria para crecer.",
            "Si nunca fallaste, es porque no lo intentaste.",
            "Va a ser más difícil antes de que sea más fácil. Pero mejorará. Solo tienes que superarlo.",
            "El duelo nunca termina... pero cambia. Es un pasaje, no un lugar para quedarse. El duelo no es un signo de debilidad, ni falta de fe... es el precio del amor.",
            "La vida tiene muchas formas de poner a prueba la voluntad de una persona, ya sea haciendo que no suceda nada en absoluto o haciendo que todo suceda a la vez. Resiste.",
            "Yo estoy siempre aquí, para que vivamos juntos tu tristeza y después nos vamos a celebrar ¿Vale?",
            "Lo mejor de llegar al fondo, es que ya solo puedes subir.",
            "Todos los días nos ofrecen algo para sonreír.",
            "Levántate, sacúdete y sigue adelante.",
            "Donde se cierra una puerta, cientos de ventanas se abren.",
            "Lo mejor es lo que pasó.",
            "La vida da muchas vueltas. Hoy quizás estás abajo, mañana estarás en la cima.",
            "Las lágrimas vienen del corazón y no del cerebro.",
            "La tristeza también es un tipo de defensa. Ivo Andrich.",
            "La tristeza duele, pero es un sentimiento saludable. Es algo necesario para sentir.",
            "Es triste no amar, pero es mucho más triste no poder amar.",
            "Es mucho mejor que olvides y sonrías a que recuerdes y estés triste.",
            "La buena vida no es aquella inmune a la tristeza, sino aquella en la que el sufrimiento contribuye a nuestro desarrollo.",
            "No te sientas mal por sentirte triste. Eso es natural en la vida.",
            "Tu fuerza y entereza son más grandes que cualquier dificultad.",
            "La melancolía es la alegría de estar triste.",
            "Las cosas cambian. Y los amigos se van. La vida no se detiene para nadie.",
            "A veces, cuando las cosas se están desmoronando, es posible que en realidad se estén acomodando",
            "No llores porque se terminó, sonríe porque lo viviste.",
            "A veces la vida no te da algo que quieres, no porque no lo merezcas, sino porque mereces más.",
            "Toda mi vida se puede describir en una frase: no salió según lo planeado, y está bien.",
            "Tratar de evitar la tristeza es tratar de evitar la vida.",
            "Lo que nos hace llorar, nos llevará a la gracia. Nuestro dolor nunca se desperdicia.",
            "A veces tienes que ser capaz de escucharte a ti mismo y estar bien sin que nadie más te entienda.",
            "No te aflijas. Todo lo que pierdes vuelve de otra forma, confía.",
    };
    int f = 0;
    //array para frases cuando estas enojado
    String[] caraE = {
            "Estar enojado es vengar el error de los demás sobre nosotros mismos",
            "El enojo es una emoción válida. Solo es malo cuando toma el control y te hace hacer cosas que no quieres hacer",
            "El enojo es una señal, una que vale la pena escuchar",
            "El enojo es un ácido que puede hacer más daño al recipiente en el que se almacena que a cualquier cosa en la que se vierte",
            "La espada más aguda es una palabra pronunciada con enojo.",
            "El enojo te hace más pequeño, mientras que el perdón te obliga a crecer más allá de lo que eres",
            "Lo que empieza en enojo termina en vergüenza",
            "El enojo nunca aparece sin razón, pero rara vez aparece con una buena",
            "No te aferres al enojo, daño o dolor. Roban tu energía y te alejan del amor.",
            "Es sabio dirigir el enojo hacia los problemas, no hacia la gente. Para concentrar tus energías en respuestas, no en excusas.",
            "Cuánto más graves son las consecuencias del enojo que las causas del mismo",
            "Cuando aprietas el puño, nadie puede poner nada en tu mano, ni tu mano puede recoger nada.",
            "La amargura es como el cáncer. Se come al anfitrión. Pero el enojo es como el fuego. Quema todo hasta dejarlo en cenizas.",
            "El mejor guerrero nunca está enojado",
            "El enojo es una locura breve.",
            "Un corazón lleno de enojo no tiene espacio para el amor",
            "El enojo hace ingeniosos a los hombres aburridos, pero los mantiene pobres",
            "Cualquiera puede enfadarse, eso es fácil. Pero estar enojado con la persona adecuada en el grado correcto, en el momento adecuado para el propósito correcto, y de la manera correcta, no está en las posibilidades de todos y no es fácil.",
            "Un necio da plena libertad a su enojo, pero un hombre sabio se mantiene bajo control.",
            "El enojo es una condición en la cual la lengua funciona más rápido que la mente",
            "El enojo es un combustible. Necesitas combustible para lanzar un cohete. Pero si todo lo que tienes es combustible sin ningún mecanismo interno para dirigirlo, no tienes un cohete.",
            "Todas las personas enojonas deben ser tratadas, por los prudentes, como niños",
            "unca te vayas a la cama enojado. Quédate y pelea",
            "Por lo general, cuando la gente está triste, no hace nada. Solo lloran por su condición. Pero cuando se enojan, provocan un cambio.",
            "El que es apacible en el enojo es mejor que el poderoso. Aquel que gobierna su espíritu, es mejor que el que toma una ciudad.",
            "El enojo guardado es un veneno. Te come por dentro. Creemos que el odio es un arma para atacar a quien nos lastima. Pero el odio es una navaja de dos filos. El daño que hacemos, lo hacemos a nosotros mismos.",
            "Cuando estés enojado, cuenta cuatro; cuando estés muy enojado, maldice",
            "Es importante que la gente tenga en cuenta que mientras el enojo es un sentimiento que todo el mundo tiene, la agresión es solo una opción.",
            "Estaba enojado con mi amigo: verbalicé mi enojo, mi enojo terminó. Estaba enojado con mi enemigo: no lo verbalicé, mi enojo creció.",
            "No pierdas tu tiempo con enojos, arrepentimientos, preocupaciones y rencores. La vida es muy corta para ser infeliz.",
            "El problema con el enojo es que una vez que se quema, te quedas con el tanque vacío",
    };
    int j = 0;
    //array para frases cuando estas frustrado
    String[] caraFr = {
            "Sin frustración, no descubrirás que puedes hacer algo por tu cuenta. Crecemos a través del conflicto",
            "Enamorarse y encontrar tu pasión, son intentos de localizar, imaginar, representar aquello por lo que inconscientemente te sientes frustrado",
            "La frustración, el desánimo y la depresión significan que estás trabajando contra ti mismo",
            "La frustración es una flecha direccional importante. Te muestra a dónde ir para avanzar. Y de qué alejarte",
            "En tiempos de gran estrés o adversidad, siempre es mejor mantenerse ocupado, dirigir tu ira y tu energía en algo positivo",
            "La frustración es la nodriza de la violencia",
            "Es la falta de claridad lo que crea caos y frustración. Esas emociones son veneno para cualquier sujeto vivo",
            "La madurez es la capacidad de pensar, hablar y actuar dentro de los límites de la dignidad. La medida de tu madurez es cuán espiritual te vuelves en medio de tus frustraciones",
            "La frustración de los pensamientos y sentimientos es el comienzo del crimen y el pecado. El mundo sufre de eso",
            "Para vencer la frustración, uno debe permanecer intensamente enfocado en el resultado, no en los obstáculos",
            "La frustración es un signo muy positivo. Significa que la solución a tu problema está dentro del alcance, pero lo que estás haciendo actualmente no está funcionando y necesitas cambiar tu enfoque para lograr tu objetivo",
            "La expectativa es la madre de toda frustración",
            "La frustración, aunque a veces es bastante dolorosa, es una parte muy positiva y esencial del éxito",
            "Y salí de allí sin golpear a nadie, patear a nadie o llorar. Algunos días las pequeñas victorias son todo lo que logras",
            "Estás aquí para aprender algo. No intentes descubrir qué es. Eso puede ser frustrante e improductivo",
            "Las aspiraciones sin preparativos simplemente te darán una vida llena de frustraciones. ¡Desarrollate tu mismo hoy!",
            "Olvida ser perfecto en el primer intento. Ante la frustración, tu mejor herramienta son algunas respiraciones profundas, y recordar que puedes hacer cualquier cosa una vez que hayas practicado doscientas veces. Seriamente",
            "La frustración es una gran fuerza impulsora. ¡Nunca puedes mejorar hasta que estés frustrado por tu estilo de vida actual!",
            "Si tu éxito no es sorprendente para tus críticos, los perturbas, los enfureces y los frustras, entonces debes esforzarte más",
            "Motivación sin movilización significa solo frustración",
            "Estoy muy frustrado por el miedo a la imaginación, no creo que sea saludable",
            "Toda la energía de tu frustración causa miedo en tu risa",
            "La persona en la que quieres convertirte es otra parte de tus miedos y frustraciones",
            "El amor romántico nos entrega a los brazos apasionados de alguien que finalmente desencadenará las mismas frustraciones que tuvimos con nuestros padres, ¡pero por la mejor razón posible!",
            "Cambia tu forma de pensar y cambiarás tu forma de sentir",
            "Dolly fue el signo de exclamación en mi vida. Ella me hizo sentir cosas: adoración, ira, frustración. Ella siempre estuvo enamorada y eso la hacía brillar",
            "Sé amoroso en el conflicto o amoroso en la frustración o deja que el amor ordene todas tus interacciones porque el amor nunca falla",
            "Ella simplemente empujó su pecho en completa frustración. Dio un paso atrás, solo para que ella sintiera que había ganado algo de terreno. Ahora si eso no fue amor, se cortaría la lengua",
            "Como he conocido la desesperación, valoro la esperanza. Como he probado la frustración, valoro la satisfacción. Como he estado solo, valoro el amor",
            "La frustración y el amor no pueden existir en el mismo lugar, al mismo tiempo",
            "Si alguien me grita, no está expresando amor. Puede estar amenazándome. Pueden estar expresando gran frustración conmigo. Puede que simplemente esté tratando de controlar mi comportamiento. Sin embargo, no están comunicando amor",
    };
    int k = 0;
    //array para frases cuando estas enamorado
    String[] caraEn = {
            "Cuando estás enamorado de alguien, estás enamorado de su rostro y se convierte en un rostro que no se parece a ningún otro",
            "Lo que se necesita para conseguir la felicidad, no es una vida cómoda, sino un corazón enamorado.",
            "Cuando uno está enamorado, mantiene su mente y su pensamiento en sintonía con el ser que ama.",
            "Todo es más claro cuando estás enamorado",
            "Lo que no te voy a decir es que siento haberme enamorado de ella, porque no lo siento",
            "No comprendo cómo puede haber alguien que haga el amor sin estar enamorado",
            "Es posible hablar con extrema dureza de lo que se ama, precisamente porque se ama, y con la autoridad moral que nos confiere ese mismo amor",
            "Amar es el más preciado regalo que se puede dar; ser amado el más preciado regalo que se puede recibir.",
            "Amar es arriesgarse a que no le quieran. Esperar es arriesgarse a sentir dolor. Intentar es arriesgarse a fracasar. Pero hay que arriesgarse. Porque lo más peligroso en esta vida es no arriesgar nada",
            "Si tuviera que volver a comenzar mi vida, intentaría encontrarte mucho antes",
            "Eres mi todo, mi más, mi siempre",
            "Porque sin buscarte, ando encontrándote por todos lados, especialmente cuando cierro los ojos",
            "Te amaría de cualquier forma, en cualquier mundo, con cualquier pasado",
            "No sé si estamos hechos el uno para el otro, pero si hemos llegado hasta aquí es porque seguimos eligiéndonos cada día y eso es como estar hechos el uno para el otro",
            "Amar no es mirarse el uno al otro; es mirar juntos en la misma dirección",
            "Nunca dejes de enloquecerme. Lo necesito",
            "Dicen que una mente ocupada no extraña a nadie. Y mírame, con mil cosas por hacer y siempre elijo pensarte",
            "Y cuanto más te conozco, más me quiero contigo",
            "Nunca pude estar más de acuerdo con la vida como cuando te trajo a mí",
            "Tienes el corazón perfecto para hacer un hogar",
            "Lo primero que pensé cuando te conocí fue que mi suerte empezaba a mejorar",
            "Nunca terminaré de enamorarme de ti",
            "Hay rincones en el mundo que son pura magia. Tú, por ejemplo",
            "Qué cosa más bonita es verte, mientras me ves, viéndote a ti",
            "¿Por qué tú? Por esa forma en la que acariciabas todo lo que no me gustaba de mí misma",
            "No puedo prometerte la luna y las estrellas. Pero puedo prometerte unas cervezas juntos y mirarlas todas las veces que tú quieras",
            "Tus ojos están como para perderse en ellos",
            "Y entonces lo entendí: Mirarte era como soplar las velas teniendo el deseo enfrente",
            "En medio de todo este silencio, tu risa me hace volver a vivir",
            "No sabía lo que quería hasta que quería verte todos los días",
            "Y cuando me besa, sostiene mi cara con ambas manos como si fuese la luna",
            "No sé a dónde nos lleva esto, pero sí sé que quiero ir contigo",
    };
    int e = 0;
    //array para frases cuando estas confundido
    String[] caraCo = {
            "Es muy bueno estar confundido. La confusión es de donde viene la inspiración",
            "No tengas miedo de confundirte. Todo es posible",
            "Nunca escondas cosas de pensadores incondicionales. Se vuelven más agravados, más provocados por la confusión que las verdades más dolorosas",
            "Lo más confuso que te sentirás es cuando tratas de convencer a tu corazón y espíritu de algo que tu mente sabe que es una mentira",
            "La confusión es un lujo que solo los muy, muy jóvenes pueden permitirse y ya no eres tan joven",
            "No sé a qué se refiere con eso, pero asiento y le sonrío. Te sorprendería lo lejos que puede llegar esa respuesta en una conversación en la que estás completamente confundido",
            "Los tiempos de gran calamidad y confusión han sido productivos para las mentes más grandes. El mineral más puro se produce del horno más caliente. El rayo más brillante se obtiene de la tormenta más oscura",
            "Con gran poder a menudo viene una gran confusión",
            "Es probable que haya turbulencias en las nubes de confusión antes de que uno pueda ver los cielos amigables y una pista de aterrizaje iluminada",
            "Para aquellos que te confunden, reconoce que su confusión es suya y tu claridad es tuya",
            "Es sorprendente cuán confundidas, distraídas y mal dirigidas están tanta gente",
            "Creo que algunas personas ni siquiera saben de qué están hablando, y simplemente comienzan a hablar con una opinión, sin hacer preguntas",
            "La historia y la experiencia nos dicen que el progreso moral no se produce en tiempos cómodos y complacientes, sino fuera de juicio y cuando estamos confundidos",
            "Los peligros de no pensar con claridad son mucho mayores ahora que nunca. No es que haya algo nuevo en nuestra forma de pensar, es que el pensamiento crédulo y confuso puede ser mucho más letal en formas que nunca antes había sido",
            "No tenía nada que ofrecer a nadie excepto mi propia confusión",
            "Simplemente no puedo construir mis esperanzas sobre una base de confusión y miseria. Creo que… la paz y la tranquilidad volverán de nuevo",
            "La verdad surge más fácilmente del error que de la confusión",
            "Su intelecto puede estar confundido, pero sus emociones nunca le mentirán",
            "Solía irme durante semanas en un estado de confusión",
            "En un momento de la vida te quedas atascado y confundido",
            "Su intelecto puede estar confundido, pero sus emociones nunca le mentirán",
            "Lo más confuso que tenemos es cuando tratamos de convencer a nuestras cabezas de algo que nuestro corazón sabe que es una mentira",
            "Cualquiera que no esté confundido, realmente no entiende la situación",
            "Si me veo confundido es porque estoy pensando",
            "Si no estás confundido, no estás prestando atención",
            "Hoy, si no estás confundido, no estás pensando con claridad",
            "Algún día todo tendrá perfecto sentido. Entonces, por ahora, ríete de la confusión, sonríe entre lágrimas, sé fuerte y sigue recordándote a ti mismo que todo sucede por una razón",
            "Cuando no sabes por dónde empezar, simplemente ve a un lugar que extrañas tanto",
            "¿Confuso? La confusión es buena. Es un excelente lugar para aprender algo nuevo",
            "Si la confusión es el primer paso hacia el conocimiento, debo ser un genio",
            "Confundí las cosas con sus nombres: eso es creencia",
            "Crecí en una casa confusa: demasiada atención no deseada o ninguna",
    };
    int c = 0;
    //array pra frases cuando estas asustado
    String[] caraAs = {
            "Temo a un solo enemigo que se llama, yo mismo",
            "Para quien tiene miedo, todo son ruidos",
            "El miedo es mi compañero más fiel, jamás me ha engañado para irse con otro",
            "Tiraríamos muchas cosas, si no tuviéramos miedo de que otros las recogieran",
            "No hace falta conocer el peligro para tener miedo; de hecho, los peligros desconocidos son los que inspiran más temor",
            "Los tímidos tienen miedo antes del peligro; los cobardes, durante el mismo; los valientes, después",
            "De lo que tengo miedo es de tu miedo",
            "A los verdugos se les reconoce siempre. Tienen cara de miedo",
            "El miedo y yo nacimos gemelos",
            "Muchos no creen en nada, pero temen a todo",
            "El miedo es el más ignorante, el más injurioso y el más cruel de los consejeros",
            "Tengo miedo de la muerte y del dolor, pero convivo con eso. El miedo me fascina",
            "No hay medicina para el miedo",
            "Las personas exitosas aprenden a sobreponerse a sus miedos en lugar de dejar que sus miedos manejen su vida",
            "El miedo no es más que un deseo al revés.",
            "Siempre se ha de conservar el temor, más jamás se debe mostrar",
            "Nada en la vida debe ser temido, solamente comprendido. Ahora es el momento de comprender más, para temer menos",
            "Cuando se teme a alguien es porque a ese alguien le hemos concedido poder sobre nosotros",
            "Nadie llegó a la cumbre acompañado por el miedo",
            "Bajo la máscara de la temeridad se ocultan grandes temores",
            "Ninguna persona es capaz de escoger sin miedo",
            "La violencia es el miedo a los ideales de los demás",
            "El hombre que tiene miedo sin peligro, inventa el peligro para justificar su miedo",
            "Me da miedo, me da mucho miedo todo este asunto. Pero lo que más me asusta, ahora que sé lo que sé… Es lo que siento por ti",
            "No temas ni a la prisión, ni a la pobreza, ni a la muerte. Teme al miedo",
            "La mayoría de las personas tienen miedo a la muerte porque no han hecho nada de su vida",
            "Quienes tienen miedo de la verdad es que viven en la mentira.",
            "No es tan fiero el león como lo pintan",
            "El valor espera, el miedo va a buscar",
            "El miedo es ese pequeño cuarto oscuro donde los objetivos negativos son revelados",
            "Jamás negociemos con miedo, pero jamás temamos negociar",
            "No hay cosa de la que tenga tanto miedo como del miedo",
    };
    int s = 0;
    //array para frases cuando estas fachero
    String[] caraFa = {
            "Solo hay 2 clases de personas: las que aman, y las que no me conocen",
            "Soy un lujo, pero creo que lo vales",
            "No envejezco, me vuelvo vintage",
            "No olvides enamorarte de ti mismo primero",
            "No me importa lo que pienses de mí, a menos que pienses que soy genial. Entonces, estás en lo correcto",
            "No me dan miedo los amigos perdedores como Judas… ellos solos se ahorcan!",
            "Unos desean el talento, otros nos encargamos de hacerlo realidad!",
            "Cuando veo mi grandeza, me pregunto, si Dios dejó algo para los demás.",
            "No es por presumir pero en realidad soy un capricho de la perfección",
            "No soy raro, soy edición limitada",
            "Mi complejo de superioridad es mejor que el tuyo…",
            "Me amo tanto que no hay espacio en mi para otra persona",
            "Hoy me gusto mas que ayer… pero menos que mañana.",
            "Lo importante no es ganar sino hacer perder al otro",
            "Todas las cosas vivientes están vivas por el egocentrismo",
            "El egocentrismo es el reconocimiento de que toda cosa viviente ve el mundo desde una sola y propia perspectiva",
            "Las personas egocéntricas no solo destruyen relaciones, se destruyen a sí mismas",
            "Lo único bueno de ser egocéntrico es que cuidas más de ti mismo, aunque llega un punto en el que los demás se olvidan de cuidar de ti",
            "Un egocéntrico no es alguien que no se preocupa por los demás, es alguien que directamente no piensa en los demás",
            "Cuando una persona pronuncia la palabra «yo» más de 5 veces en menos de un minuto, tiene muchas probabilidades de ser un gran egocéntrico",
            "No solo es egocéntrico el que no mira por los demás, sino también el que mira por los demás para aprovecharse de ellos",
            "Cuando veas a un egocéntrico, corre como si hubieras visto salir un león de una jaula",
            "Todas las personas inmaduras tienen cierto grado de egocentrismo y una persona madura, por definición, no puede ser egocéntrica",
            "A veces una persona es tan egocéntrica que piensa que el dolor que produce no tiene consecuencias que se volverán en su contra",
            "Ser egocéntrico es uno de los peores rasgos, porque tarde o temprano se alejará tanto de las personas, que no tendrá tiempo para volver",
            "Una persona ciega y bondadosa tiene más vista que una persona egocéntrica que no mira por los demás",
            "Egocéntrico no es igual a egoísta. El egocéntrico puede dar cosas para luego beneficiarse a costa de los demás, el egoísta no da nada directamente",
            "Alguien egocéntrico navega solo hacia las tinieblas de la soledad eterna",
            "Prefiero un egocéntrico a un maleducado. No todos los egocéntricos hacen daño, pero una persona sin moral y maleducada, puede destruir a alguien débil en cuestión de segundos",
            "Crece como un egocéntrico y te encontrarás pronto en un desierto interminable",
            "El egocéntrico solo tiene una forma de ver el mundo, de forma que todo le ocurre a él y todo le tiene que beneficiar a él",
    };
    int h = 0;
    //array para frases cuando estas payaso
    String[] caraPa = {
            "La mujer perdona las infidelidades, pero no las olvida. El hombre olvida las infidelidades, pero no las perdona",
            "Los hombres engañan más que las mujeres; las mujeres, mejor",
            "Hay que ser infiel, pero nunca desleal",
            "Las infidelidades se perdonan, pero no se olvidan jamás",
            "El adulterio es justificable: el alma necesita pocas cosas; el cuerpo muchas",
            "La diferencia de la infidelidad en los dos sexos es tan real que una mujer apasionada puede perdonar una infidelidad, cosa imposible para un hombre",
            "Para creerse infiel es preciso creerse amado",
            "En ninguna cosa la infidelidad es más innoble y repugnante que en el amor",
            "Regresar con quien te engañó es como pedir que te cambien la sopa pero que dejen la mosca",
            "Los hombres engañan más que las mujeres; las mujeres, mejor",
            "Basta tan solo una mentira para poner en duda todas las verdades",
            "Nunca te van a cambiar por algo mejor, sino por algo más fácil",
            "Estamos ya grandes para explicarle al otro lo que sabe que está mal haciendo mal",
            "Un hombre verdadero será honesto sin importar lo dolorosa que sea la verdad. Solo el cobarde se esconde entre las mentiras y el engaño",
            "Si tienes que esconder el móvil para que tu pareja a quien le escribes, entonces debes permanecer soltero",
            "Solo un verdadero hombre se da cuenta que una mujer es suficiente.",
            "Si ella te fue infiel, agradécelo, porque seguro no era para ti. Laméntate pero sigue adelante",
            "Nunca comiences una nueva relación si no has terminado la anterior",
            "Estar soltero es mejor que mentir, engañar y faltarle al respeto a alguien",
            "Nunca discutas con alguien que se cree sus propias mentiras",
            "Las disculpas no son nada si sigues haciendo aquello por lo cual te disculpaste en un principio",
            "No dejes una chica que necesitas por una chica que deseas.",
            "Ojalá lo que estés buscando valga más que lo que estás perdiendo",
            "No creo que un hombre valga tanto como para tener dos mujeres, ni que una mujer valga tan poco como para ser la segunda",
            "Los hombres infieles nunca cambian, solo se van de vacaciones",
            "Los mentirosos nunca cambian solo modifican su estrategia",
            "La peor traición no viene de tus enemigos, sino de tus amigos",
            "Nunca subestimes la habilidad de un mentiroso para hacerte sentir culpable por sus errores",
            "Las verdades envenenadas son más crueles que las peores mentiras.",
            "Las mujeres para ser infieles necesitan una razón, los hombres solo otra mujer",
            "Y lo quise como a nadie y él me quiso como a todas",
            "Los mentirosos siempre se sienten las víctimas de sus propios juegos",
    };
    int p = 0;
    TextView tv3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        //obtener nombre de activity1
        String dato = getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        tv2.setText("Hola " + dato + " " + dato2 + " como te sientes hoy");
    }
    //boton volver
    public void volver(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
    //boton cerrar
    @SuppressLint("")
    public void cerrar(View view){
        finishAffinity();
    }
    //Cara feliz
    @SuppressLint("SetTextI18n")
    public void c1 (View view) {
        if (i <= 49) {
            tv3.setText(caraF[i]);
            i++;
        } else {
            i = 0;
            tv3.setText(". . .");
        }
    }
    //Cara troste
    public void c2 (View view)
    {
        if (f <= 39) {
            tv3.setText(caraT[f]);
            f++;
        } else {
            f = 0;
            tv3.setText(". . .");

        }
    }
    //cara enojada
    public void c3 (View view)
    {
        if (j <= 29) {
            tv3.setText(caraE[j]);
            j++;
        } else {
            j = 0;
            tv3.setText(". . .");

        }
    }
    //cara frustrado
    public void c4 (View view)
    {
        if (k <= 30) {
            tv3.setText(caraFr[k]);
            k++;
        } else {
            k = 0;
            tv3.setText(". . .");

        }
    }
    //cara enamorado
    public void c5 (View view)
    {
        if (e <= 30) {
            tv3.setText(caraEn[e]);
            e++;
        } else {
            e = 0;
            tv3.setText(". . .");

        }
    }
    //cara confundido
    public void c6 (View view)
    {
        if (c <= 30) {
            tv3.setText(caraCo[c]);
            c++;
        } else {
            c = 0;
            tv3.setText(". . .");

        }
    }
    //cara asustado
    public void c7 (View view)
    {
        if (s <= 30) {
            tv3.setText(caraAs[s]);
            s++;
        } else {
            s = 0;
            tv3.setText(". . .");

        }
    }
    //cara fachero
    public void c8 (View view)
    {
        if (h <= 30) {
            tv3.setText(caraFa[h]);
            h++;
        } else {
            h = 0;
            tv3.setText(". . .");

        }
    }
    //cara poyaso
    public void c9 (View view)
    {
        if (p <= 30) {
            tv3.setText(caraPa[p]);
            p++;
        } else {
            p = 0;
            tv3.setText(". . .");

        }
    }
}