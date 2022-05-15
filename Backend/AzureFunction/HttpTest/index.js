module.exports = async function(context,req){
    try{
        context.log("Funcion HTTP procesando peticion.")

        //Leemos la data entrante 
        const name = (req.query.name || (req.body && req.body.name));
        const sport = (req.query.sport || (req.body && req.body.sport));

        const NOMBRE = (req.query.NOMBRE || (req.body && req.body.NOMBRE));
        const APELLIDO_PATERNO = (req.query.APELLIDO_PATERNO || (req.body && req.body.APELLIDO_PATERNO));
        const APELLIDO_MATERNO = (req.query.APELLIDO_MATERNO || (req.body && req.body.APELLIDO_MATERNO));
        const FECHA_DE_NACIMIENTO = (req.query.FECHA_DE_NACIMIENTO || (req.body && req.body.FECHA_DE_NACIMIENTO));
        const GENERO = (req.query.GENERO || (req.body && req.body.GENERO));
        const CORREO_ELECTRONICO = (req.query.CORREO_ELECTRONICO || (req.body && req.body.CORREO_ELECTRONICO));
        const NOMBRE_USUARIO = (req.query.NOMBRE_USUARIO || (req.body && req.body.NOMBRE_USUARIO));

        //Regresamos estatus 400 si no llega la data requerida
        if (!NOMBRE || !APELLIDO_PATERNO ||!APELLIDO_MATERNO || !FECHA_DE_NACIMIENTO || !GENERO || !CORREO_ELECTRONICO || !NOMBRE_USUARIO){
            context.res = {
                status:400,
                message:"Todos los datos son requeridos, favor de llenar toda la información que se muestar en pantalla"
            }
            return;
        }


        //Construir mensaje
        const message = `${NOMBRE} ${APELLIDO_PATERNO} ${APELLIDO_MATERNO}, usted fue registrado exitosamente`;

        //Registar en base
        const id = Math.random().toString().substring(2,8)
        context.bindings.outputDocument = JSON.stringify({
            id:id,
            NOMBRE:NOMBRE,
            APELLIDO_PATERNO:APELLIDO_PATERNO,
            APELLIDO_MATERNO:APELLIDO_MATERNO,
            FECHA_DE_NACIMIENTO:FECHA_DE_NACIMIENTO,
            GENERO:GENERO,
            CORREO_ELECTRONICO:CORREO_ELECTRONICO,
            NOMBRE_USUARIO:NOMBRE_USUARIO,

        });

        //Construimos el JSON de respuesta
        const responseJson = {
            "id":id,
            "Nombre": `${NOMBRE} ${APELLIDO_PATERNO} ${APELLIDO_MATERNO}`,
            "Nombre_usuario":NOMBRE_USUARIO,
            "message":message,
            "success":true
        }

        context.res = {
            body:responseJson,
            contentType:'application/json'
        };

    }catch(err){
        context.res = {
            status:500
        };
    }
}