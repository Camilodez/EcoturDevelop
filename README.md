
# Ecotur Awaq





## Funcionalidades principales



- **Ecodex:**  Inspirada en la "pokedex" del popular anime Pokémon, nuestra aplicación permite a los usuarios tomar fotos de la flora y fauna del parque. Gracias a la API de Google Vision, la aplicación identificará el organismo en la imagen y proporcionará información detallada al usuario, como el nombre común del organismo, nombre científico, taxonomía, y otros datos relevantes. **(por implementar)**
  

- **Diario de Viaje:** Los usuarios podrán registrar sus experiencias y descubrimientos en el parque Awaq. Podrán llevar un diario digital de su viaje, donde podrán documentar avistamientos únicos a través de la Ecodex y otros momentos memorables para crear una experiencia inolvidable.
  ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/fb13001f-fd32-43a3-ae99-43062dae8438)


  ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/da403702-5589-4668-a95c-150b03438052)


  
  

- **Red Social:** Esta funcionalidad permitirá a los usuarios compartir sus experiencias con otros visitantes del parque y reaccionar a sus publicaciones. Podrán interactuar a través de comentarios, "me gusta" y compartir sus propios relatos y fotos.
  ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/d72b0f04-df96-4d1f-ba58-b9a08d081b51)

  



## Cómo ejecutar la app?

- **Opción 1 (modo fácil):**
  * Descarga el archivo Ecotur.apk en tu teléfono
  * abrelo y cuando aparezca el anuncio de ¿deseas instalar esta app? dale click a instalar:
    ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/a5187a75-6f7a-4b99-918a-d225eee4174a)
    
  * si ya hiciste los 2 pasos anteriores podrás encontrar tu app instalada en la lista de aplicaciones de tu teléfono:
    ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/c9d05886-7deb-410c-9d0e-e14b93e7fc35)
    
    solo tendrás que clickearla y se abrirá

- **Opción 2:**
  * Si tienes Android Studio Arctic Fox 2020.3.1 o superior, puedes descargar este repositorio y abrir el proyecto en Android Studio
  * En la esquina superior izquierda verás una barra con opciones como: File, Edit, View, etc. Dale click a file y en el menú desplegable que aparecerá a continuación da click en la opción sync gradle files:
    ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/2c82a0bc-0d78-48d7-b66c-40b443765e1e)
    
  * Espera a que la barra azul de la esquina inferior derecha desaparezca (eso significa que ya ha terminado de sincronizar el gradle):
    ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/a33d6c92-60bd-4199-a3be-43c1898c5b2c)
    
  * Activa las opciones de desarrollador en tu teléfono, puedes seguir el siguiente tutorial para hacerlo: https://developer.android.com/studio/debug/dev-options?hl=es-419
  * Una vez las actives, puedes conectar tu celular al puerto USB de tu computadora mediante cable
  * Ahora deberia aparecer el nombre de tu dispositivo en android studio:
    ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/a83bacb6-d20e-4193-bb6b-7243aef44fdf)

  * Ahora da click en el botón de ejecutar:
    ![image](https://github.com/Camilodez/EcoturDevelop/assets/101293233/e3708778-78f0-4c03-9f78-b48795ee374c)

  * Espera un momento a que android studio cargue la app a tu teléfono y automáticamente se abrirá esta
  









## Información para programadores:

Built with AndroidX Support

Requires Android Studio Arctic Fox | 2020.3.1 or higher.

Current Kotlin Version 1.7.20


### SDK Versions

compileSdkVersion 33

buildToolsVersion "30.0.3"

minSdkVersion 23

targetSdkVersion 33


### Libraries

1. Retrofit- REST API Call
https://square.github.io/retrofit/
2. Glide - Image Loading and caching.
https://github.com/bumptech/glide
3. Material Design Components - Google's latest Material Components.
https://material.io/develop/android
4. koin - Dependency Injection
https://insert-koin.io/

### Figma design guideline for better accuracy

Read our guidelines to increase the accuracy of design conversion to code by optimizing Figma designs. 
https://docs.dhiwise.com/docs/Designguidelines/intro .

### App Navigation

Check your app\'s UI from the AppNavigation screens of your app.

### Package Structure


```
├── appcomponents       
│ ├── di                 - Dependency Injection Components 
│ │ └── MyApp.kt
│ ├── network            - REST API Call setup
│ │ ├── ResponseCode.kt
│ │ └── RetrofitProvider.kt
│ └── ui                 - Data Binding Utilities
│     └── CustomBindingAdapter.kt
├── constants            - Constant Files
│ ├── IntegerConstants.kt
│ └── StringConstants.kt
├── extensions           - Kotlin Extension Function Files
│ └── Strings.kt
├── modules              - Application Specific code
│ └── example            - A module of Application 
│  ├── ui                - UI handling classes
│  └── data              - Data Handling classes
│    ├── viewmodel       - ViewModels for the UI
│    └── model           - Model for the UI
└── network              - REST API setup
  ├── models             - Request/Response Models
  ├── repository         - Network repository
  ├── resources          - Common classes for API
  └── RetrofitService.kt
```
