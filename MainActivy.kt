@Composable
fun LoginSwissWallet(modifier: Modifier = Modifier) {

    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }

    Column (modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.linearGradient(
                colors = listOf(
                    colorResource(R.color.top_gradient),
                    colorResource(R.color.body_gradient),
                    colorResource(R.color.bottom_gradient)
                )
            )
        )
        .padding(start = 32.dp, end = 32.dp)
    ) {
        Spacer(
            modifier =
            modifier.height(229.dp)
        )

        Text (
            text = stringResource(R.string.title),
            fontSize = 32.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 39.dp)
        )

        OutlinedTextField (
            label = {
                Text(
                    text = "Digite seu email",
                    color = colorResource(R.color.white),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            },

            value = email,

            onValueChange = { email = it},

            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Transparent),

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.White),

            textStyle = TextStyle(color = Color.White, fontSize = 18.sp),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person, contentDescription = "Person",
                    tint = Color.White
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField (
            label = {
                Text(
                    text = "Digite sua Senha",
                    color = colorResource(R.color.white),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            },

            value = password,

            onValueChange = { password = it},

            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Transparent),

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.White),

            textStyle = TextStyle(color = Color.White, fontSize = 18.sp),

            visualTransformation = PasswordVisualTransformation(),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "Lock",
                    tint = Color.White
                )
            },

            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            )
        )

        Spacer (modifier = Modifier.height(20.dp))

        Box (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text (
                text = "Esqueci Minha Senha",
                color = Color.White,
                fontSize = 17.sp,
                textAlign = TextAlign.End,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.align(Alignment.CenterEnd)
                    .clickable {  }

            )
        }

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(R.color.body_gradient))
                .clip(shape = RoundedCornerShape(10.dp))
                .border(1.dp, color = Color.Transparent, shape = RoundedCornerShape(10.dp))
                .height(45.dp)
                .clickable {  }
                .padding(start = 2.dp, end = 2.dp)
        ) {
            Text (
                text = "Login",
                color = Color.White,
                fontSize = 17.sp,
                textAlign = TextAlign.End,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
