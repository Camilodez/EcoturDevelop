
# Ecotur Awaq

## Funcionalidades principales

- **Ecodex:**  Inspirada en la "pokedex" del popular anime Pokémon, nuestra aplicación permite a los usuarios tomar fotos de la flora y fauna del parque. Gracias a la API de Google Vision, la aplicación identificará el organismo en la imagen y proporcionará información detallada, como su nombre común, nombre científico, taxonomía, y otros datos relevantes. **(por implementar)**

- **Diario de Viaje:** Los usuarios podrán registrar sus experiencias y descubrimientos en el parque Awaq. Podrán llevar un diario digital de su viaje, donde podrán documentar avistamientos únicos a través de la Ecodex y otros momentos memorables para crear una experiencia inolvidable.

- **Red Social:** Esta funcionalidad permitirá a los usuarios compartir sus experiencias con otros visitantes del parque y reaccionar a sus publicaciones. Podrán interactuar a través de comentarios, "me gusta" y compartir sus propios relatos y fotos.


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
