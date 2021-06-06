package com.example.permisos

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

@RequiresApi(Build.VERSION_CODES.M)
val recordA = registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted ->
    when {
        isGranted -> {
            Toast.makeText( this, "Permiso Permitido", Toast.LENGTH_SHORT).show()
        }

        /* shouldShowRequestPermissionRationale(android.Manifest.permission.ACCESS_COARSE_LOCATION) ->
             Toast.makeText(this, "Rationale",Toast.LENGTH_SHORT).show()*/

        else -> Toast.makeText(this, "Permiso Denegado" , Toast.LENGTH_SHORT).show()
    }

}
val coursePermission = registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted ->
    when {
        isGranted -> {
            Toast.makeText( this, "Permiso Permitido", Toast.LENGTH_SHORT).show()
        }

       /* shouldShowRequestPermissionRationale(android.Manifest.permission.ACCESS_COARSE_LOCATION) ->
            Toast.makeText(this, "Rationale",Toast.LENGTH_SHORT).show()*/

        else -> Toast.makeText(this, "Permiso Denegado" , Toast.LENGTH_SHORT).show()
    }

}

    val cameraPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted ->
        when {
            isGranted -> {
                Toast.makeText( this, "Permiso Permitido", Toast.LENGTH_SHORT).show()
            }

            /* shouldShowRequestPermissionRationale(android.Manifest.permission.ACCESS_COARSE_LOCATION) ->
                 Toast.makeText(this, "Rationale",Toast.LENGTH_SHORT).show()*/

            else -> Toast.makeText(this, "Permiso Denegado" , Toast.LENGTH_SHORT).show()
        }

    }

    val storagePermission = registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted ->
        when {
            isGranted -> {
                Toast.makeText( this, "Permiso Permitido", Toast.LENGTH_SHORT).show()
            }

            /* shouldShowRequestPermissionRationale(android.Manifest.permission.ACCESS_COARSE_LOCATION) ->
                 Toast.makeText(this, "Rationale",Toast.LENGTH_SHORT).show()*/

            else -> Toast.makeText(this, "Permiso Denegado" , Toast.LENGTH_SHORT).show()
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_permiso1.setOnClickListener(){
            coursePermission.launch(android.Manifest.permission.ACCESS_COARSE_LOCATION)
        }

        btn_permiso2.setOnClickListener(){
            recordA.launch(android.Manifest.permission.RECORD_AUDIO)
        }

        btn_permiso3.setOnClickListener(){
            cameraPermission.launch(android.Manifest.permission.CAMERA)
        }

        btn_permiso4.setOnClickListener(){
            storagePermission.launch(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
    }
}