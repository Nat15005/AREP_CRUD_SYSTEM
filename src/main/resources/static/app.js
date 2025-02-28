const API_URL = "/api/properties";

// Obtener referencia a los elementos del DOM
const propertyForm = document.getElementById("propertyForm");
const propertyTable = document.getElementById("propertyTable").getElementsByTagName("tbody")[0];

// Función para cargar propiedades
async function loadProperties() {
    const response = await fetch(API_URL);
    const properties = await response.json();
    propertyTable.innerHTML = ""; // Limpiar tabla
    properties.forEach(property => {
        const row = propertyTable.insertRow();
        row.innerHTML = `
            <td>${property.id}</td>
            <td>${property.address}</td>
            <td>${property.price}</td>
            <td>${property.size}</td>
            <td>${property.description}</td>
            <td class="actions">
                <button onclick="editProperty(${property.id})">Editar</button>
                <button onclick="deleteProperty(${property.id})">Eliminar</button>
            </td>
        `;
    });
}

// Función para agregar o actualizar una propiedad
propertyForm.addEventListener("submit", async (e) => {
    e.preventDefault();
    const id = document.getElementById("propertyId").value;
    const property = {
        address: document.getElementById("address").value,
        price: parseFloat(document.getElementById("price").value),
        size: parseFloat(document.getElementById("size").value),
        description: document.getElementById("description").value
    };

    const url = id ? `${API_URL}/${id}` : API_URL;
    const method = id ? "PUT" : "POST";

    await fetch(url, {
        method: method,
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(property)
    });

    propertyForm.reset();
    document.getElementById("propertyId").value = "";
    loadProperties();
});

// Función para editar una propiedad
async function editProperty(id) {
    const response = await fetch(`${API_URL}/${id}`);
    const property = await response.json();
    document.getElementById("propertyId").value = property.id;
    document.getElementById("address").value = property.address;
    document.getElementById("price").value = property.price;
    document.getElementById("size").value = property.size;
    document.getElementById("description").value = property.description;
}

// Función para eliminar una propiedad
async function deleteProperty(id) {
    await fetch(`${API_URL}/${id}`, { method: "DELETE" });
    loadProperties();
}

// Cargar propiedades al iniciar
loadProperties();