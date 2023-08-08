package com.sativa.kodibuildstv;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;

public class MainActivity2 extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        ImageButton mainmenu = findViewById(R.id.mainmenu);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

        mainmenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.button1) {
            Toast.makeText(MainActivity2.this, "You chose Covenant.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://covenant01.github.io/zip/repository.covenant-0.1.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/Covenant", "/repository.covenant-0.1.zip")
                    .setTag("DownloadCovenant")
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
                            Toast.makeText(MainActivity2.this, "Covenant is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Covenant failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button2) {
            Toast.makeText(MainActivity2.this, "You chose Exodus.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://i-a-c.github.io/repository.exodusredux-0.0.8.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Exodus","/repository.exodusredux-0.0.8.zip")
                    .setTag("DownloadExodus")
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
                            Toast.makeText(MainActivity2.this, "Exodus is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Exodus failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button3) {
            Toast.makeText(MainActivity2.this, "You chose DaButcher.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://dabutcher.org/repo/repository.dab-1.5.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/DaButcher", "/repository.dab-1.5.zip")
                    .setTag("DownloadDaButcher")
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
                            Toast.makeText(MainActivity2.this, "DaButcher is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "DaButcher failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button4) {
            Toast.makeText(MainActivity2.this, "You chose Innovation.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://kepler-22.github.io/repository.innovation-1.7.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Innovation", "/repository.innovation-1.7.zip")
                    .setTag("DownloadInnovation")
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
                            Toast.makeText(MainActivity2.this, "Innovation is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Innovation failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button5) {
            Toast.makeText(MainActivity2.this, "You chose Joker.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://defcon-one.tk/fracturedrepo/repository.fracturedrepo-0.5.6.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Joker", "/repository.fracturedrepo-0.5.6.zip")
                    .setTag("DownloadJoker")
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
                            Toast.makeText(MainActivity2.this, "Joker is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Joker failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button6) {
            Toast.makeText(MainActivity2.this, "You chose Stream Digital.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://sdwteam.com/wiz/repository.streamdigital-2.0.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Wiz", "/repository.streamdigital-2.0.zip")
                    .setTag("DownloadSStreamDigital")
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
                            Toast.makeText(MainActivity2.this, "Stream Digital is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Stream Digital failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button7) {
            Toast.makeText(MainActivity2.this, "You chose Gaia.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://repo.gaiakodi.com/repository.gaia.full.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Gaia", "/repository.gaia.full.zip")
                    .setTag("DownloadGaia")
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
                            Toast.makeText(MainActivity2.this, "Gaia is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Gaia failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button8) {
            Toast.makeText(MainActivity2.this, "You chose Estuary Switch.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://zaxxon709.github.io/repo/repository.709-1.0-Nexus.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/EstuarySwitch", "/repository.709-1.0-Nexus.zip")
                    .setTag("DownloadEstuarySwitch")
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
                            Toast.makeText(MainActivity2.this, "Estuary Switch is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Estuary Switch failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button9) {
            Toast.makeText(MainActivity2.this, "You chose Grindhouse.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://grindhousekodi.us/repo/repository.grindhousekodi-1.8.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Grindhouse", "/grindhousekodi-1.8.zip")
                    .setTag("DownloadGrindhouse")
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
                            Toast.makeText(MainActivity2.this, "Grindhouse is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Grindhouse failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button10) {
            Toast.makeText(MainActivity2.this, "You chose Kryptikz.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://www.lostkodi.appboxes.co/plugin.program.lostbuildswizard.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Kryptikz", "/plugin.program.lostbuildswizard.zip")
                    .setTag("DownloadKryptikz")
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
                            Toast.makeText(MainActivity2.this, "Kryptikz is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Kryptikz failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button11) {
            Toast.makeText(MainActivity2.this, "You chose Badazz Media Center.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://www.midian.appboxes.co/repo/repository.Wherethemonsterslive.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Badazz", "/repository.Wherethemonsterslive.zip")
                    .setTag("DownloadBadazz")
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
                            Toast.makeText(MainActivity2.this, "Badazz Media Center is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Badazz Media Center failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button12) {
            Toast.makeText(MainActivity2.this, "You chose Diggz", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://diggz1.me/diggzrepo/Diggz_Repo.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/Diggz", "/Diggz_Repo.zip")
                    .setTag("DownloadDiggz")
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
                            Toast.makeText(MainActivity2.this, "Diggz is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Diggz failed.", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
}







