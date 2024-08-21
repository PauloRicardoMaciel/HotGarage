const buttonsNext = document.querySelectorAll("[data-next='next']")
const buttonsPrevious = document.querySelectorAll("[data-previous='previous']")



export default function alterarCarrossel(button: String, cars: NodeListOf<Element>, buttons: NodeListOf<Element>, positionAtual: number) {
    if(button == "next"){
        var position = 0
        while(true){
            
            if (cars[position].classList.contains("active")){
                cars[position].classList.remove("active")
                cars[position+3].classList.add("active")
                positionAtual ++
                buttons.forEach((button) => {button.setAttribute('data-position', `${positionAtual}`)})
                break   
            }
            position++
        }
    }
    else{
        var position = 0
        while(true){

            if (cars[position].classList.contains("active")){
                cars[position+2].classList.remove("active")
                cars[position-1].classList.add("active")
                positionAtual --
                buttons.forEach((button) => {button.setAttribute('data-position', `${positionAtual}`)})
                break   
            }
        position++
        }
    }

        
        
    }
buttonsNext.forEach((buttonNext) => {
        buttonNext?.addEventListener("click", function (){
        console.log(buttonNext.getAttribute("data-id"))
        var id = buttonNext.getAttribute("data-id")
        var query = `[data-car-id= "${id}"]`
        const cars = document.querySelectorAll(query)
        const buttons = document.querySelectorAll(`[data-id= "${id}"]`)
        var positionAtual = parseInt(`${buttons[0].getAttribute('data-position')}`)
        const spanNext = document.querySelector(`#next${id}`)
        const spanPrevious = document.querySelector(`#previous${id}`)
        if(positionAtual < cars.length-3)
            alterarCarrossel('next', cars, buttons, positionAtual)
        if(positionAtual > cars.length-5)
            spanNext?.classList.remove('carousel-control-next-icon')
        if(!spanPrevious?.classList.contains('carousel-control-prev-icon')){
            spanPrevious?.classList.add('carousel-control-prev-icon')
        }
    })
})
buttonsPrevious.forEach((buttonPrevious) => {
    buttonPrevious?.addEventListener("click", function (){
    console.log(buttonPrevious.getAttribute("data-id"))
    var id = buttonPrevious.getAttribute("data-id")
    var query = `[data-car-id= "${id}"]`
    const cars = document.querySelectorAll(query)
    const buttons = document.querySelectorAll(`[data-id= "${id}"]`)
    var positionAtual = parseInt(`${buttons[0].getAttribute('data-position')}`)
    const spanNext = document.querySelector(`#next${id}`)
    const spanPrevious = document.querySelector(`#previous${id}`)
    if(positionAtual > 0)
        alterarCarrossel('previous', cars, buttons, positionAtual)
    if(positionAtual < 2)
        spanPrevious?.classList.remove('carousel-control-prev-icon')
    if(!spanNext?.classList.contains('carousel-control-next-icon')){
        spanNext?.classList.add('carousel-control-next-icon')
    }
})
})