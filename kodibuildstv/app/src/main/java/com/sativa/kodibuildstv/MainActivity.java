package com.sativa.kodibuildstv;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton thecrew = findViewById(R.id.thecrew);
        ImageButton doomzday = findViewById(R.id.doomzday);
        ImageButton xanax = findViewById(R.id.xanax);
        ImageButton ezzer = findViewById(R.id.ezzer);
        ImageButton nolimits = findViewById(R.id.nolimits);
        ImageButton cellar = findViewById(R.id.cellar);
        Button kodi64 = findViewById(R.id.kodi64);
        Button kodi32 = findViewById(R.id.kodi32);

        ImageButton readme = findViewById(R.id.readme);
        ImageButton menu2 = findViewById(R.id.menu2);

        thecrew.setOnClickListener(this);
        doomzday.setOnClickListener(this);
        xanax.setOnClickListener(this);
        ezzer.setOnClickListener(this);
        nolimits.setOnClickListener(this);
        cellar.setOnClickListener(this);
        kodi64.setOnClickListener(this);
        kodi32.setOnClickListener(this);

        final int WRITE_EXTERNAL_STORAGE = 0;
        final int REQUEST_PERMISSION = 0;

        int permissionCheckStorage = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permissionCheckStorage != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXTERNAL_STORAGE);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    REQUEST_PERMISSION);
        }

        readme.setBackgroundColor(Color.TRANSPARENT);

        menu2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }

        });
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.thecrew) {
            Toast.makeText(MainActivity.this, "You chose The Crew.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://team-crew.github.io/repository.thecrew-0.3.1.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/TheCrew", "/repository.thecrew-0.3.1.zip")
                .setTag("DownloadTheCrew")
                .setPriority(Priority.MEDIUM)
                .build()
                .setDownloadProgressListener(new DownloadProgressListener() {
                    @Override
                    public void onProgress(long bytesDownloaded, long totalBytes) {
                        // do anything with progress
                    }
                })
                .startDownload(new DownloadListener() {
                    @Override
                    public void onDownloadComplete() {
                        Toast.makeText(MainActivity.this, "The Crew is complete.", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onError(ANError error) {
                        Toast.makeText(MainActivity.this, "The Crew failed.", Toast.LENGTH_SHORT).show();
                    }
                });

        } else if (id == R.id.doomzday) {
            Toast.makeText(MainActivity.this, "You chose Doomzday.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://doomzdayteam.github.io/doomzday/repository.doomzday-1.0.7.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Doomzday", "/repository.doomzday-1.0.7.zip")
                    .setTag("DownloadDoomzday")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "Doomzday is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "Doomzday failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.xanax) {
            Toast.makeText(MainActivity.this, "You chose Xanax Builds.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://xanaxrepo.com/repo/xanax-repo.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/Xanax", "/xanax-repo.zip")
                    .setTag("DownloadXanax")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "Xanax Builds is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "Xanax Builds failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.ezzer) {
            Toast.makeText(MainActivity.this, "You chose Ezzer Macs Wizard.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://ezzer-mac.com/repo/repository.EzzerMacsWizard.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/EzzerMacs", "/repository.EzzerMacsWizard.zip")
                    .setTag("DownloadEzzer")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "Ezzer Macs Wizard is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "Ezzer Macs Wizard failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.nolimits) {
            Toast.makeText(MainActivity.this, "You chose No Limits Magic.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://www.nolimitswiz.appboxes.co/plugin.video.nolimitswizard18.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/NoLimits","/plugin.video.nolimitswizard18.zip")
                    .setTag("DownloadNoLimits")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "No Limits Magic is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "No Limits Magic failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.cellar) {
            Toast.makeText(MainActivity.this, "You chose Cellar Door.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://cellardoortv.com/repo/repository.cdrepo-10.4.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/CellarDoor", "/repository.cdrepo-10.4.zip")
                    .setTag("DownloadCellar")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "Cellar Door is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "Cellar Door failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.kodi64) {
            Toast.makeText(MainActivity.this, "You chose kodi-18.9-Leia-arm64-v8a.apk.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://mirrors.kodi.tv/releases/android/arm64-v8a/kodi-18.9-Leia-arm64-v8a.apk",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Kodiapks", "/kodi-18.9-Leia-arm64-v8a.apk")
                    .setTag("DownloadCellar")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "kodi-18.9-Leia-arm64-v8a.apk is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "kodi-18.9-Leia-arm64-v8a.apk failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.kodi32) {
            Toast.makeText(MainActivity.this, "You chose kodi-18.9-Leia-armeabi-v7a.apk.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://mirrors.kodi.tv/releases/android/arm/kodi-18.9-Leia-armeabi-v7a.apk",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Kodiapks", "/kodi-18.9-Leia-armeabi-v7a.apk")
                    .setTag("DownloadCellar")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "kodi-18.9-Leia-armeabi-v7a.apk is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "kodi-18.9-Leia-armeabi-v7a.apk failed.", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
}
