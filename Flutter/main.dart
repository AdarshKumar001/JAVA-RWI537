import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(

        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {


  @override
  Widget build(BuildContext context) {

    return Scaffold(
      appBar: AppBar(

        backgroundColor: Theme.of(context).colorScheme.inversePrimary,

        title: Text(widget.title),
      ),
      body:Container(
        color: Colors.blue.shade300,
        child: Center(
          child: Container(
            height: 100,
            width: 100,
            child: Center(child: Text("A.K",style: TextStyle(fontWeight: FontWeight.w900,fontSize: 25),)),


            decoration: BoxDecoration(
              color: Colors.white,
              borderRadius: BorderRadius.only(topLeft: Radius.circular(25),bottomRight: Radius.circular(25)),


                border: Border.all(
                width: 4,
                  color: Colors.red,
            ),


              boxShadow: [
                BoxShadow(
                  blurRadius: 22,
                  spreadRadius: 11
                )
              ]

            ),
          ),
        ),
      )
    );
  }
}
