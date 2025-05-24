import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseDatos {
    private static List<Actividad> actividades = new ArrayList<>();

    static {
        actividades.add(new Actividad("Medellín", "Jardín Botánico", "Naturaleza"));
        actividades.add(new Actividad("Bogotá", "Museo del Oro", "Historia"));
        actividades.add(new Actividad("Santa Marta", "Parque Tayrona", "Naturaleza"));
        actividades.add(new Actividad("Cartagena", "Castillo de San Felipe", "Historia"));
        actividades.add(new Actividad("Cartagena", "Tour en barco por Islas del Rosario", "Naturaleza"));
        actividades.add(new Actividad("Bogotá", "Cerro de Monserrate", "Espiritualidad"));
        actividades.add(new Actividad("Bogotá", "Planetario Distrital", "Ciencia"));
        actividades.add(new Actividad("Medellín", "Comuna 13 – Graffitour", "Cultura"));
        actividades.add(new Actividad("Medellín", "Metrocable a Parque Arví", "Naturaleza"));
        actividades.add(new Actividad("San Agustín", "Parque Arqueológico San Agustín", "Historia"));
        actividades.add(new Actividad("Pasto", "Carnaval de Negros y Blancos", "Cultura"));
        actividades.add(new Actividad("Salento", "Valle de Cocora", "Naturaleza"));
        actividades.add(new Actividad("Leticia", "Tour por el Amazonas", "Aventura"));

        actividades.add(new Actividad("Popayán", "Catedral Basílica Nuestra Señora de la Asunción", "Espiritualidad"));
        actividades.add(new Actividad("Cali", "Cristo Rey", "Espiritualidad"));
        actividades.add(new Actividad("Cali", "Parque Nacional Natural Farallones", "Naturaleza"));
        actividades.add(new Actividad("Santa Marta", "Ciudad Perdida – Caminata", "Aventura"));
        actividades.add(new Actividad("Tunja", "Puente de Boyacá", "Historia"));
        actividades.add(new Actividad("Armenia", "Parque del Café", "Aventura"));
        actividades.add(new Actividad("Bucaramanga", "Parque Nacional del Chicamocha (PANACHI)", "Naturaleza"));
        actividades.add(new Actividad("Manizales", "Catedral Basílica Nuestra Señora del Rosario", "Espiritualidad"));
        actividades.add(new Actividad("Santa Fe de Antioquia", "Puente de Occidente", "Historia"));
        actividades.add(new Actividad("Ipiales", "Santuario de Las Lajas", "Espiritualidad"));
        actividades.add(new Actividad("Quibdó", "Festival de San Pacho", "Cultura"));
        actividades.add(new Actividad("Barrancabermeja", "Ruta del Cacao", "Gastronomía"));

        actividades.add(new Actividad("Bogotá", "Visita el Museo del Oro", "Historia"));
        actividades.add(new Actividad("Bogotá", "Cerro de Monserrate y su santuario", "Espiritual"));
        actividades.add(new Actividad("Bogotá", "Recorrido por La Candelaria", "Cultura"));
        actividades.add(new Actividad("Bogotá", "Caminata en los cerros orientales", "Aventura"));
        actividades.add(new Actividad("Bogotá", "Prueba el ajiaco santafereño", "Gastronomía"));
        actividades.add(new Actividad("Bogotá", "Planetario de Bogotá", "Ciencia"));

        actividades.add(new Actividad("Medellín", "Parque Arví y sus senderos ecológicos", "Naturaleza"));
        actividades.add(new Actividad("Medellín", "Museo Casa de la Memoria", "Historia"));
        actividades.add(new Actividad("Medellín", "Catedral Metropolitana", "Espiritual"));
        actividades.add(new Actividad("Medellín", "Comuna 13 y sus murales", "Cultura"));
        actividades.add(new Actividad("Medellín", "Metrocable y caminatas urbanas", "Aventura"));
        actividades.add(new Actividad("Medellín", "Bandeja paisa tradicional", "Gastronomía"));
        actividades.add(new Actividad("Medellín", "Parque Explora", "Ciencia"));

        actividades.add(new Actividad("Cartagena", "Islas del Rosario", "Naturaleza"));
        actividades.add(new Actividad("Cartagena", "Castillo San Felipe de Barajas", "Historia"));
        actividades.add(new Actividad("Cartagena", "Iglesia San Pedro Claver", "Espiritual"));
        actividades.add(new Actividad("Cartagena", "Centro histórico y arquitectura colonial", "Cultura"));
        actividades.add(new Actividad("Cartagena", "Paseo en kayak por la bahía", "Aventura"));
        actividades.add(new Actividad("Cartagena", "Arepa de huevo y mariscos", "Gastronomía"));
        actividades.add(new Actividad("Cartagena", "Centro de Investigación Oceanográfica", "Ciencia"));

        actividades.add(new Actividad("Santa Marta", "Parque Tayrona", "Naturaleza"));
        actividades.add(new Actividad("Santa Marta", "Ciudad Perdida", "Historia"));
        actividades.add(new Actividad("Santa Marta", "Santuario de la Virgen del Carmen", "Espiritual"));
        actividades.add(new Actividad("Santa Marta", "Quinta de San Pedro Alejandrino", "Cultura"));
        actividades.add(new Actividad("Santa Marta", "Buceo en Taganga", "Aventura"));
        actividades.add(new Actividad("Santa Marta", "Cazuela de mariscos", "Gastronomía"));
        actividades.add(new Actividad("Santa Marta", "Acuario del Rodadero", "Ciencia"));

        actividades.add(new Actividad("Cali", "Zoológico de Cali", "Naturaleza"));
        actividades.add(new Actividad("Cali", "Iglesia La Merced", "Historia"));
        actividades.add(new Actividad("Cali", "Iglesia de San Antonio", "Espiritual"));
        actividades.add(new Actividad("Cali", "Feria de Cali y salsa caleña", "Cultura"));
        actividades.add(new Actividad("Cali", "Parapente en el cerro de las tres cruces", "Aventura"));
        actividades.add(new Actividad("Cali", "Cholado y empanadas vallunas", "Gastronomía"));
        actividades.add(new Actividad("Cali", "Centro de ciencia Interactiva Descubre", "Ciencia"));

        actividades.add(new Actividad("Manizales", "Nevado del Ruiz", "Naturaleza"));
        actividades.add(new Actividad("Manizales", "Catedral Basílica", "Historia"));
        actividades.add(new Actividad("Manizales", "Santuario de la Virgen de la Esperanza", "Espiritual"));
        actividades.add(new Actividad("Manizales", "Festival Internacional de Teatro", "Cultura"));
        actividades.add(new Actividad("Manizales", "Termales de Santa Rosa", "Aventura"));
        actividades.add(new Actividad("Manizales", "Café y postres de origen", "Gastronomía"));
        actividades.add(new Actividad("Manizales", "Observatorio astronómico de la Universidad de Caldas", "Ciencia"));

        actividades.add(new Actividad("Bucaramanga", "Parque Nacional del Chicamocha", "Naturaleza"));
        actividades.add(new Actividad("Bucaramanga", "Museo Casa de Bolívar", "Historia"));
        actividades.add(new Actividad("Bucaramanga", "Catedral de la Sagrada Familia", "Espiritual"));
        actividades.add(new Actividad("Bucaramanga", "Festival de música UIS", "Cultura"));
        actividades.add(new Actividad("Bucaramanga", "Parapente en Ruitoque", "Aventura"));
        actividades.add(new Actividad("Bucaramanga", "Cabrito con pepitoria", "Gastronomía"));
        actividades.add(new Actividad("Bucaramanga", "Centro Interactivo Neomundo", "Ciencia"));

        actividades.add(new Actividad("Villavicencio", "Parque los Ocarros", "Naturaleza"));
        actividades.add(new Actividad("Villavicencio", "Monumento a Cristo Rey", "Historia"));
        actividades.add(new Actividad("Villavicencio", "Iglesia Catedral de Nuestra Señora del Carmen", "Espiritual"));
        actividades.add(new Actividad("Villavicencio", "Joropo y cultura llanera", "Cultura"));
        actividades.add(new Actividad("Villavicencio", "Rafting en el río Güejar", "Aventura"));
        actividades.add(new Actividad("Villavicencio", "Mamona llanera", "Gastronomía"));
        actividades.add(new Actividad("Villavicencio", "Bioparque Los Ocarros", "Ciencia"));

        actividades.add(new Actividad("Neiva", "Desierto de la Tatacoa", "Naturaleza"));
        actividades.add(new Actividad("Neiva", "Museo Arqueológico Regional del Huila", "Historia"));
        actividades.add(new Actividad("Neiva", "Catedral de la Inmaculada Concepción", "Espiritual"));
        actividades.add(new Actividad("Neiva", "Festival del Bambuco", "Cultura"));
        actividades.add(new Actividad("Neiva", "Senderismo en el desierto", "Aventura"));
        actividades.add(new Actividad("Neiva", "Asado huilense", "Gastronomía"));
        actividades.add(new Actividad("Neiva", "Observatorio astronómico Tatacoa", "Ciencia"));

        actividades.add(new Actividad("Pasto", "Laguna de la Cocha", "Naturaleza"));
        actividades.add(new Actividad("Pasto", "Museo del Oro Nariñense", "Historia"));
        actividades.add(new Actividad("Pasto", "Santuario de Nuestra Señora de Las Lajas", "Espiritual"));
        actividades.add(new Actividad("Pasto", "Carnaval de Negros y Blancos", "Cultura"));
        actividades.add(new Actividad("Pasto", "Escalada en Galeras", "Aventura"));
        actividades.add(new Actividad("Pasto", "Cuy asado y empanadas de añejo", "Gastronomía"));
        actividades.add(new Actividad("Pasto", "Centro de investigación Volcán Galeras", "Ciencia"));

        actividades.add(new Actividad("Armenia", "Jardín Botánico del Quindío", "Naturaleza"));
        actividades.add(new Actividad("Armenia", "Museo del Oro Quimbaya", "Historia"));
        actividades.add(new Actividad("Armenia", "Iglesia de San Francisco de Asís", "Espiritual"));
        actividades.add(new Actividad("Armenia", "Fiesta Nacional del Café", "Cultura"));
        actividades.add(new Actividad("Armenia", "Canopy en el Parque de la Vida", "Aventura"));
        actividades.add(new Actividad("Armenia", "Trucha con patacón y arepa", "Gastronomía"));
        actividades.add(new Actividad("Armenia", "Centro de Ciencia y Café", "Ciencia"));

        actividades.add(new Actividad("Montería", "Ciénaga de Ayapel", "Naturaleza"));
        actividades.add(new Actividad("Montería", "Museo Zenú de Arte Contemporáneo", "Historia"));
        actividades.add(new Actividad("Montería", "Catedral San Jerónimo", "Espiritual"));
        actividades.add(new Actividad("Montería", "Festival Nacional del Porro", "Cultura"));
        actividades.add(new Actividad("Montería", "Navegación por el río Sinú", "Aventura"));
        actividades.add(new Actividad("Montería", "Carne asada con yuca y suero", "Gastronomía"));
        actividades.add(new Actividad("Montería", "Centro Ambiental del Sinú", "Ciencia"));

        actividades.add(new Actividad("Cúcuta", "Cerro Tasajero y su mirador natural", "Naturaleza"));
        actividades.add(new Actividad("Cúcuta", "Museo Norte de Santander", "Historia"));
        actividades.add(new Actividad("Cúcuta", "Iglesia Catedral de San José", "Espiritual"));
        actividades.add(new Actividad("Cúcuta", "Festival Internacional de la Frontera", "Cultura"));
        actividades.add(new Actividad("Cúcuta", "Senderismo en el Ecoparque Pamplonita", "Aventura"));
        actividades.add(new Actividad("Cúcuta", "Mute santandereano y hayacas", "Gastronomía"));
        actividades.add(new Actividad("Cúcuta", "Centro de Ciencia y Tecnología del Norte", "Ciencia"));

        actividades.add(new Actividad("Barranquilla", "Bocas de Ceniza y su encuentro del río Magdalena con el mar", "Naturaleza"));
        actividades.add(new Actividad("Barranquilla", "Museo del Caribe", "Historia"));
        actividades.add(new Actividad("Barranquilla", "Iglesia de San Nicolás de Tolentino", "Espiritual"));
        actividades.add(new Actividad("Barranquilla", "Carnaval de Barranquilla", "Cultura"));
        actividades.add(new Actividad("Barranquilla", "Recorrido en bicicleta por la Gran Malecón", "Aventura"));
        actividades.add(new Actividad("Barranquilla", "Butifarra soledeña y arroz de lisa", "Gastronomía"));
        actividades.add(new Actividad("Barranquilla", "Parque Cultural del Caribe - Sala Interactiva", "Ciencia"));

        actividades.add(new Actividad("Villa de Leyva", "Pozos Azules y paisajes desérticos", "Naturaleza"));
        actividades.add(new Actividad("Villa de Leyva", "Casa Museo Antonio Nariño", "Historia"));
        actividades.add(new Actividad("Villa de Leyva", "Iglesia Parroquial de Nuestra Señora del Rosario", "Espiritual"));
        actividades.add(new Actividad("Villa de Leyva", "Festival de Luces y Semana Santa", "Cultura"));
        actividades.add(new Actividad("Villa de Leyva", "Caminatas por el Valle Escondido", "Aventura"));
        actividades.add(new Actividad("Villa de Leyva", "Longaniza y arepas boyacenses", "Gastronomía"));
        actividades.add(new Actividad("Villa de Leyva", "Museo Paleontológico", "Ciencia"));

        actividades.add(new Actividad("Salento", "Valle de Cocora y palmas de cera", "Naturaleza"));
        actividades.add(new Actividad("Salento", "Mirador Alto de la Cruz con historia cafetera", "Historia"));
        actividades.add(new Actividad("Salento", "Iglesia de Nuestra Señora del Carmen", "Espiritual"));
        actividades.add(new Actividad("Salento", "Artesanías y cultura cafetera", "Cultura"));
        actividades.add(new Actividad("Salento", "Cabalgatas por las montañas", "Aventura"));
        actividades.add(new Actividad("Salento", "Trucha con patacón y arepa", "Gastronomía"));
        actividades.add(new Actividad("Salento", "Finca El Ocaso con procesos de café", "Ciencia"));

// Leticia (complementaria a la que ya tenías)
        actividades.add(new Actividad("Leticia", "Reserva Natural Tanimboca", "Naturaleza"));
        actividades.add(new Actividad("Leticia", "Museo Etnográfico del Amazonas", "Historia"));
        actividades.add(new Actividad("Leticia", "Catedral de Nuestra Señora de la Paz", "Espiritual"));
        actividades.add(new Actividad("Leticia", "Cultura indígena Ticuna y Huitoto", "Cultura"));
        actividades.add(new Actividad("Leticia", "Canopy y avistamiento en la selva", "Aventura"));
        actividades.add(new Actividad("Leticia", "Pescado moqueado y fariña", "Gastronomía"));
        actividades.add(new Actividad("Leticia", "Instituto SINCHI de biodiversidad", "Ciencia"));

        actividades.add(new Actividad("Popayán", "Parque Natural Puracé", "Naturaleza"));
        actividades.add(new Actividad("Popayán", "Puente del Humilladero y centro histórico", "Historia"));
        actividades.add(new Actividad("Popayán", "Catedral Basílica Nuestra Señora de la Asunción", "Espiritual"));
        actividades.add(new Actividad("Popayán", "Semana Santa y arquitectura blanca", "Cultura"));
        actividades.add(new Actividad("Popayán", "Senderismo en el volcán Puracé", "Aventura"));
        actividades.add(new Actividad("Popayán", "Empanadas de pipián y tamales caucano", "Gastronomía"));
        actividades.add(new Actividad("Popayán", "Centro de Investigación del Agua - CIAT", "Ciencia"));

        actividades.add(new Actividad("Tunja", "Páramo de Iguaque", "Naturaleza"));
        actividades.add(new Actividad("Tunja", "Puente de Boyacá", "Historia"));
        actividades.add(new Actividad("Tunja", "Catedral Basílica Santiago de Tunja", "Espiritual"));
        actividades.add(new Actividad("Tunja", "Festival Internacional de la Cultura", "Cultura"));
        actividades.add(new Actividad("Tunja", "Senderismo ecológico urbano", "Aventura"));
        actividades.add(new Actividad("Tunja", "Caldo de costilla y arepa boyacense", "Gastronomía"));
        actividades.add(new Actividad("Tunja", "Universidad Pedagógica y sus laboratorios de ciencia", "Ciencia"));

    }

    public static List<Actividad> getActividades() {
        return actividades;
    }

    public static void agregarActividad(Actividad a) {
        actividades.add(a);
    }


    public static List<Actividad> filtrar(String ciudad, String tipo) {
        return actividades.stream()
                .filter(a -> (ciudad.isEmpty() || a.getCiudad().equalsIgnoreCase(ciudad)) &&
                        (tipo.isEmpty() || a.getTipo().equalsIgnoreCase(tipo)))
                .collect(Collectors.toList());
    }
}


