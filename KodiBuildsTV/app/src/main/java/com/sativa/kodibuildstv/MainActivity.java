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

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton thecrew = findViewById(R.id.thecrew);
        ImageButton doomzday = findViewById(R.id.doomzday);
        ImageButton magneticrepo = findViewById(R.id.magneticrepo);
        ImageButton ezzer = findViewById(R.id.ezzer);
        ImageButton nolimits = findViewById(R.id.nolimits);
        ImageButton cman = findViewById(R.id.cman);
        Button kodi64 = findViewById(R.id.kodi64);
        Button kodi32 = findViewById(R.id.kodi32);

        ImageButton readme = findViewById(R.id.readme);
        ImageButton menu2 = findViewById(R.id.menu2);

        thecrew.setOnClickListener(this);
        doomzday.setOnClickListener(this);
        magneticrepo.setOnClickListener(this);
        ezzer.setOnClickListener(this);
        cman.setOnClickListener(this);
        nolimits.setOnClickListener(this);
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

        menu2.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
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
                .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                    // do anything with progress
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
            AndroidNetworking.download("https://doomzdayteam.github.io/doomzday/repository.doomzday-1.1.0.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Doomzday", "/repository.doomzday-1.1.0.zip")
                    .setTag("DownloadDoomzday")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
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

        } else if (id == R.id.magneticrepo) {
            Toast.makeText(MainActivity.this, "You chose Magnetic Builds.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://magnetic.website/repo/repository.Magnetic-1.1.0b.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/Magnetic", "/repository.Magnetic-1.1.0b.zip")
                    .setTag("DownloadMagnetic")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "Magnetic Builds is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "Magnetic Builds failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.ezzer) {
            Toast.makeText(MainActivity.this, "You chose Ezzer Macs Wizard.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://ezzer-mac.com/repo/repository.EzzerMacsWizard-1.1.6.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/EzzerMacs", "/repository.EzzerMacsWizard-1.1.6.zip")
                    .setTag("DownloadEzzer")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
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
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
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

        } else if (id == R.id.cman) {
            Toast.makeText(MainActivity.this, "You chose CmAn.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://cmanbuilds.com/repo/repository.cMaNWizard-2.1.zip", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/CmAn", "/repository.cMaNWizard-2.1.zip")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "CmAn is complete.", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "CmAn failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.kodi64) {
            Toast.makeText(MainActivity.this, "You chose kodi-20.2-Nexus-arm64-v8a.apk (Android 64)`.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://mirrors.kodi.tv/releases/android/arm64-v8a/kodi-20.2-Nexus-arm64-v8a.apk?https=1", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/Kodiapks", "/kodi-20.2-Nexus-arm64-v8a.apk")
                    .setTag("DownloadKodi20-2")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "kodi-20.2-Nexus-arm64-v8a.apk is complete.", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "kodi-20.2-Nexus-arm64-v8a.apk failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.kodi32) {
            Toast.makeText(MainActivity.this, "You chose kodi-20.2-Nexus-armeabi-v7a.apk (Android 32).", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://mirrors.kodi.tv/releases/android/arm/kodi-20.2-Nexus-armeabi-v7a.apk?https=1",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Kodiapks", "/kodi-20.2-Nexus-armeabi-v7a.apk")
                    .setTag("DownloadKodi32")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener((bytesDownloaded, totalBytes) -> {
                        // do anything with progress
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity.this, "kodi-20.2-Nexus-armeabi-v7a.apk is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity.this, "kodi-20.2-Nexus-armeabi-v7a.apk failed.", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
}
