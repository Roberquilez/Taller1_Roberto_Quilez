Link del repositorio: https://github.com/Roberquilez/Taller1_Roberto_Quilez.git


## Funcionalidad

### Home Screen
- Muestra un saludo basado en la hora del día (Buenos días, Buenas tardes, Buenas noches).
- Botón para navegar a la pantalla principal (Main Screen).

### Main Screen
- Permite al usuario introducir su nombre y guardarlo en una lista.
- Botón para mostrar/ocultar la lista de nombres guardados.
- Botón para navegar a la pantalla de ajustes (Settings Screen).

### Settings Screen
- Permite al usuario cambiar el color de fondo de la pantalla seleccionando entre los colores Rojo, Azul, Amarillo y Verde.
- Botón para navegar de vuelta a la pantalla de inicio (Home Screen).

### Implementación de AsyncTask y AsyncTaskLoader
- AsyncTask
La clase GreetingAsyncTask extiende AsyncTask y se utiliza para determinar el saludo basado en la hora del día. El método doInBackground obtiene la hora actual y devuelve un saludo apropiado ("Buenos días", "Buenas tardes" o "Buenas noches"). El método onPostExecute actualiza la UI con el saludo obtenido.

### AsyncTaskLoader
- La clase GreetingAsyncTaskLoader extiende AsyncTaskLoader y también se utiliza para determinar el saludo basado en la hora del día. El método loadInBackground obtiene la hora actual y devuelve un saludo apropiado. El método onStartLoading fuerza la carga del loader.
