package com.example.examen3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleProductoActivity extends AppCompatActivity {
    private Producto producto;
    private TextView textViewDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        textViewDesc = findViewById(R.id.textViewDesc);
        Bundle bundle = getIntent().getExtras();
        String string = bundle.getString("producto");
        //producto = (Producto) bundle.get("producto");

        if (string.equals("PORTÁTIL")) {
            textViewDesc.setText("Una computadora portátil funciona con una batería recargable, " +
                    "contiene una pantalla LED o LCD, teclado, panel táctil o touchpad, " +
                    "una unidad de estado sólido o disco duro, puertos como USB o HDMI, cámara, etc. y" +
                    " puede tener diferentes sistemas operativos como MacOS, Linux, Windows y Chrome OS.\n");
        } else if (string.equals("ALTAVOZ")) {
            textViewDesc.setText("Un altavoz " +
                    "(también conocido como parlante, altoparlante, bocina o corneta, mayormente en América del Sur) " +
                    "es un transductor electroacústico, esto es, un dispositivo que convierte una " +
                    "señal eléctrica de audio en ondas mecánicas de sonido.\u200B Un sistema de altavoz, " +
                    "generalmente referido simplemente como altavoz, incluye uno o más transductores," +
                    " un bafle, conexiones eléctricas, y posiblemente incluya un filtro de cruce.\n");
        } else if (string.equals("RATÓN")) {
            textViewDesc.setText("Además de mover un cursor, " +
                    "el mouse tiene uno o más botones para permitir operaciones como la selección de" +
                    " un elemento de menú en una pantalla. El mouse también suele contar con otros" +
                    " elementos, como superficies táctiles y ruedas de desplazamiento, que permiten" +
                    " un control adicional y entrada dimensional.\n");
        } else if (string.equals("ALFOMBRILLA")) {
            textViewDesc.setText("La alfombrilla de ratón, alfombrilla posa ratón, almohadilla de" +
                    " ratón o mousepad es la superficie sobre la que se apoya y se desliza el ratón" +
                    " o mouse de la computadora, de manera análoga al movimiento del puntero en la pantalla.\n");
        } else if (string.equals("MICRÓFONO")) {
            textViewDesc.setText("Las características principales que debemos valorar a la hora de decantarnos por un micrófono u otro son las siguientes: \n" +
                    "El nivel de presión acústica máxima. \n" +
                    "Nivel de ruido propio. \n" +
                    "Relación señal a ruido. \n" +
                    "Sensibilidad. \n" +
                    "Impedancia. \n" +
                    "Límite de saturación.\n");
        } else if (string.equals("USB")) {
            textViewDesc.setText("El Bus Universal en Serie (BUS) (en inglés: Universal Serial Bus)," +
                    " más conocido por la sigla USB, es un bus de comunicaciones que sigue un estándar que define los cables," +
                    " conectores y protocolos usados en un bus para conectar, comunicar y proveer de alimentación eléctrica" +
                    " entre computadoras, periféricos y dispositivos electrónicos.\n");
        }
    }
}
