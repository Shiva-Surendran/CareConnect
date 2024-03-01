// ignore_for_file: prefer_const_constructors, prefer_const_literals_to_create_immutables

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';


void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Colors.green,
        appBar: AppBar(
          title: Text(''),
          backgroundColor: Colors.green,
        ),
        body: SafeArea(
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.account_circle_rounded,size: 125,),
                Text(
                  'Welcome!',
                  style: TextStyle(fontWeight: FontWeight.bold,fontSize: 45) ) ,   
                SizedBox(
                  height: 50,
                ),
                Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 24.0),
                  child: Container(
                    decoration: BoxDecoration(
                        color: Color.fromARGB(255, 180, 237, 157),
                        border: Border.all(
                            color: const Color.fromARGB(255, 135, 133, 133)),
                        borderRadius: BorderRadius.circular(20)),
                    child: Padding(
                      padding: const EdgeInsets.only(left: 18.0),
                      child: TextField(
                        decoration: InputDecoration(
                          border: InputBorder.none,
                          hintText: 'Login Name',
                        ),
                      ),
                    ),
                  ),
                ),
                SizedBox(
                  height: 25,
                ),
                Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 24.0),
                  child: Container(
                    decoration: BoxDecoration(
                        color: Color.fromARGB(255, 180, 237, 157),
                        border: Border.all(
                            color: const Color.fromARGB(255, 135, 133, 133)),
                        borderRadius: BorderRadius.circular(20)),
                    child: Padding(
                      padding: const EdgeInsets.only(left: 18.0),
                      child: TextField(
                        obscureText: true,
                        decoration: InputDecoration(
                          border: InputBorder.none,
                          hintText: 'Password',
                        ),
                      ),
                    ),
                  ),
                ),
                SizedBox(height: 25),
                Center(
                    child: Container(
                        padding: EdgeInsets.all(15),
                        decoration: BoxDecoration(
                          color: const Color.fromARGB(255, 246, 246, 246),
                          borderRadius: BorderRadius.circular(20),
                        ),
                        child: Text(
                          'SIGN IN',
                          style: TextStyle(
                              fontWeight: FontWeight.bold, fontSize: 18),
                        ))),
                SizedBox(
                  height: 25,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text('Not a Member? ',
                        style: TextStyle(
                            fontWeight: FontWeight.bold, fontSize: 18)),
                    Text(
                      'Sign Up',
                      style: TextStyle(
                          color: Color.fromARGB(81, 2, 46, 244),
                          fontWeight: FontWeight.bold,
                          fontSize: 18),
                    )
                  ],
                )
              ],
            ),
          ),
        ),
      ),
    );
  }
}
