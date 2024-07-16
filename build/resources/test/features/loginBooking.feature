# language: es

Característica: Abrir la pagina web de booking para reservar un hotel

  Escenario: Login en la pagina de booking
    Dado abre el sitio web de booking
    Cuando ingresa las credenciales
    Entonces visualizara el texto Tu cuenta


  @filtro
  Escenario: Filtrar Buequeda Hotel
    Dado el usuario esta en el sitio de booking
    Cuando el usuario selecciona los filtros de busqueda
    Entonces el usuario visualiza el hotel


