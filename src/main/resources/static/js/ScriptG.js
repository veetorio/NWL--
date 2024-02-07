const send = document.getElementById('send')

send.addEventListener('click', () => {
    const body = colect()
    const request = post(body)

    console.log(request)
})


function colect() {
    const obj = {
        "email": document.getElementById('email').value,
        "banner": document.getElementById('banner').value,
        "icon": document.getElementById('icon').value,
        "certificados" : []
    }
    return obj
}
async function post(object) {
    const header = {
        headers: {
            Accept: "application/json",
            "Content-Type": "application/json",
        },
        method: "POST",
        body: JSON.stringify(object)
    }
    const url = 'http://localhost:3001/DB-X'
    const request = await fetch(url,header);

    return request;
}


