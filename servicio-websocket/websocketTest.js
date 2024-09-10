var socket = new WebSocket("ws://localhost:8080/ws");
socket.onopen = function () {
  console.log("Conexión establecida");
};
socket.onerror = function (error) {
  console.log("Error: " + error);
};
